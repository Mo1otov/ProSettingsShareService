package proSettingsShareService.util;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import proSettingsShareService.entity.SysAdmin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mxw
 * @since 2023/9/20 10:38
 */
@Component
public class JWTUtil {
    //JWT秘钥
    private String AUTHORIZE_TOKEN_SECRET = "proSettings";
    //JWT过期时间，单位毫秒。 7*24*60*60*1000=604800000
    private long AUTHORIZE_TOKEN_EXPIRE = 604800000;

    /**
     *
     * @return token
     */

    public String createJwt(SysAdmin sysAdmin) {
        //jwt的加密算法
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //获取当前时间戳,生成过期时间
        long nowMillis = System.currentTimeMillis();
        long expMillis = nowMillis + AUTHORIZE_TOKEN_EXPIRE;
        Date expDate = new Date(expMillis);
        //token的签发时间
        Date now = new Date(nowMillis);
        //需要保存到token字符串的有用信息
        Map<String, Object> map = new HashMap<>();
        map.put("accountRole", sysAdmin.getAccountRole());
        map.put("accountId", "" + sysAdmin.getAccountId());
        map.put("accountName", sysAdmin.getAccountName());
        JwtBuilder builder = Jwts.builder()
                .setClaims(map)  //设置附加信息
                // .setId("1")
//                .setSubject("权限验证")   // 主题
                .setIssuer("proSettings")     // 签发者
                .setIssuedAt(now)      // 签发时间
                .signWith(signatureAlgorithm, AUTHORIZE_TOKEN_SECRET)  // 签名算法以及密匙
                .setExpiration(expDate); // 过期时间
        return builder.compact();
    }

    /**
     * 验证JWT
     *
     * @param token
     * @return
     */

    public TableResult<Claims> validateJWT(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(AUTHORIZE_TOKEN_SECRET)
                    .parseClaimsJws(token)
                    .getBody();
            System.out.println("token是正确的");
            return TableResult.ok("", claims);
        } catch (ExpiredJwtException e) {
            System.out.println("token过期");
            return TableResult.error(2, "token过期");
        } catch (SignatureException e) {
            System.out.println("token签名不正确");
            return TableResult.error(3, "token校验异常");
        } catch (Exception e) {
            System.out.println("其他异常");
            return TableResult.error(4, "token异常");
        }
    }
}
