package proSettingsShareService.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

/**
 * @author mxw
 * @since 2023/9/13 14:51
 */
public class MybatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/prodb?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=Asia/Shanghai", "root", "hy7631").globalConfig(builder -> {
            builder.author("mxw") // 设置作者
                    .outputDir("D:\\Practice\\ProSettingsShareService\\src\\main\\java"); // 指定输出目录
        }).packageConfig(builder -> {
            builder.parent("proSettingsShareService"); // 设置父包名
        }).strategyConfig(builder -> {
            builder.addInclude("pro_mouse_info"); // 设置需要生成的表名
        }).execute();
    }
}
