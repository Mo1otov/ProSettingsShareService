package proSettingsShareService.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mxw
 * @since 2023-09-15
 */
@TableName("pro_csgo_video_settings")
public class ProCsgoVideoSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    @TableId(value = "pro_id", type = IdType.AUTO)

    private Integer proId;

    /**
     * 选手游戏id
     */
    private String proGameId;

    /**
     * 游戏内分辨率
     */
    private String videoResolution;

    /**
     * 游戏画面比例
     */
    private String videoAspectRatio;

    /**
     * 游戏画面缩放模式
     */
    private String videoScalingMode;

    /**
     * 游戏画面颜色模式
     */
    private String videoColorMode;

    /**
     * 游戏画面亮度
     */
    private String videoBrightness;

    /**
     * 游戏画面显示模式
     */
    private String videoDisplayMode;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProGameId() {
        return proGameId;
    }

    public void setProGameId(String proGameId) {
        this.proGameId = proGameId;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    public String getVideoAspectRatio() {
        return videoAspectRatio;
    }

    public void setVideoAspectRatio(String videoAspectRatio) {
        this.videoAspectRatio = videoAspectRatio;
    }

    public String getVideoScalingMode() {
        return videoScalingMode;
    }

    public void setVideoScalingMode(String videoScalingMode) {
        this.videoScalingMode = videoScalingMode;
    }

    public String getVideoColorMode() {
        return videoColorMode;
    }

    public void setVideoColorMode(String videoColorMode) {
        this.videoColorMode = videoColorMode;
    }

    public String getVideoBrightness() {
        return videoBrightness;
    }

    public void setVideoBrightness(String videoBrightness) {
        this.videoBrightness = videoBrightness;
    }

    public String getVideoDisplayMode() {
        return videoDisplayMode;
    }

    public void setVideoDisplayMode(String videoDisplayMode) {
        this.videoDisplayMode = videoDisplayMode;
    }

    @Override
    public String toString() {
        return "ProCsgoVideoSettings{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", videoResolution = " + videoResolution +
        ", videoAspectRatio = " + videoAspectRatio +
        ", videoScalingMode = " + videoScalingMode +
        ", videoColorMode = " + videoColorMode +
        ", videoBrightness = " + videoBrightness +
        ", videoDisplayMode = " + videoDisplayMode +
        "}";
    }
}
