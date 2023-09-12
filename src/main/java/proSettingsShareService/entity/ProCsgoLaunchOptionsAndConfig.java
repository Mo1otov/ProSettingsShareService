package proSettingsShareService.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
@TableName("pro_csgo_launch_options_and_config")
public class ProCsgoLaunchOptionsAndConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

    /**
     * 游戏启动参数
     */
    private String launchOptions;

    /**
     * 游戏config
     */
    private byte[] config;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getLaunchOptions() {
        return launchOptions;
    }

    public void setLaunchOptions(String launchOptions) {
        this.launchOptions = launchOptions;
    }

    public byte[] getConfig() {
        return config;
    }

    public void setConfig(byte[] config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "ProCsgoLaunchOptionsAndConfig{" +
        "proId = " + proId +
        ", launchOptions = " + launchOptions +
        ", config = " + config +
        "}";
    }
}
