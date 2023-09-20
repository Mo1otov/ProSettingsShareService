package proSettingsShareService.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author mxw
 * @since 2023/9/20 10:40
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    //设置要拦截的URL
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**")  //拦截所有请求
                .excludePathPatterns("/sysAdmin/login");  //不拦截的URL
    }

    @Bean   //把我们写的拦截器注入到容器
    public AuthInterceptor authenticationInterceptor() {
        return new AuthInterceptor();
    }
}
