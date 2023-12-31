package proSettingsShareService.util;

import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author mxw
 * @since 2023/9/20 10:38
 */
public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    private JWTUtil jwtUtil;

    //获取token
    //校验token
    //根据token获取用户以及role
    //判断用户能否访问请求的这个方法
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object)
            throws Exception {
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(Auth.class)) {
            Auth auth = method.getAnnotation(Auth.class);
            if (auth.value()) {
                // 没有提交token

                if (token == null) {
                    httpServletResponse.setCharacterEncoding("UTF-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    String respStr = JSON.toJSONString(TableResult.error(1, "没有token，请重新登录"));
                    httpServletResponse.getOutputStream().write(respStr.getBytes("UTF-8"));
                    return false;
                }
                //token校验失败
                TableResult<Claims> result = jwtUtil.validateJWT(token);  //校验token
                if (result.getCode() != 0) {
                    httpServletResponse.setCharacterEncoding("UTF-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    String respStr = JSON.toJSONString(TableResult.error(2, result.getMsg()));
                    httpServletResponse.getOutputStream().write(respStr.getBytes("UTF-8"));
                    return false;
                }

                String accountId = (String) result.getObj().get("accountId");
                String accountRole = (String) result.getObj().get("accountRole");
                String accountName = (String) result.getObj().get("accountName");

                boolean isValid = false;
                for (String s : auth.roles()
                ) {
                    if (s.equals(accountRole)) {
                        isValid = true;
                        break;
                    }
                }
                if (!isValid) {
                    httpServletResponse.setCharacterEncoding("UTF-8");
                    httpServletResponse.setContentType("application/json; charset=utf-8");
                    String respStr = JSON.toJSONString(TableResult.error(3, "没有权限"));
                    httpServletResponse.getOutputStream().write(respStr.getBytes("UTF-8"));
                    return false;
                }

                //把用户实体保存到request, 让控制层方法可以获取登录用户信息
                httpServletRequest.setAttribute("accountRole", accountName);
                httpServletRequest.setAttribute("accountName", accountRole);
                httpServletRequest.setAttribute("accountId", accountId);
            }
        }
        return true;
    }
}
