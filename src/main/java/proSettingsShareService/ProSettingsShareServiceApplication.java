package proSettingsShareService;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author mxw
 * @since 2023/9/13 14:50
 */
@SpringBootApplication
@MapperScan("proSettingsShareService.mapper")//指定mapper接口的包名
@EnableScheduling //启用定时任务
public class ProSettingsShareServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProSettingsShareServiceApplication.class, args);
    }

    //分页插件的配置
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
