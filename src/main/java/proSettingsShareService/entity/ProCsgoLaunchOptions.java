package proSettingsShareService.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mxw
 * @since 2023-09-14
 */
@TableName("pro_csgo_launch_options")
public class ProCsgoLaunchOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

    /**
     * 游戏启动参数
     */
    private String launchOptions;

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

    @Override
    public String toString() {
        return "ProCsgoLaunchOptions{" +
        "proId = " + proId +
        ", launchOptions = " + launchOptions +
        "}";
    }
}
