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
@TableName("pro_csgo_advanced_video_settings")
public class ProCsgoAdvancedVideoSettings implements Serializable {

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
     * 游戏全局阴影质量
     */
    private String avGlobalShadowQuality;

    /**
     * 游戏纹理细节
     */
    private String avTextureDetail;

    /**
     * 游戏效果细节
     */
    private String avEffectDetail;

    /**
     * 游戏着色器细节
     */
    private String avShaderDetail;

    /**
     * 增强玩家对比度
     */
    private String avBoostPlayerContrast;

    /**
     * 游戏多核优化
     */
    private String avMulticoreRendering;

    /**
     * 游戏多重采样抗锯齿模式
     */
    private String avMultisamplingAntiAliasingMode;

    /**
     * 游戏FXAA抗锯齿
     */
    private String avFxaaAntiAliasing;

    /**
     * 游戏纹理过滤模式
     */
    private String avTextureFilteringMode;

    /**
     * 游戏等待垂直同步
     */
    private String avWaitForVerticalSync;

    /**
     * 游戏动态模糊
     */
    private String avMotionBlur;

    /**
     * 三重监视器模式
     */
    private String avTripleMonitorMode;

    /**
     * 使用着色器
     */
    private String avUseUberShaders;

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

    public String getAvGlobalShadowQuality() {
        return avGlobalShadowQuality;
    }

    public void setAvGlobalShadowQuality(String avGlobalShadowQuality) {
        this.avGlobalShadowQuality = avGlobalShadowQuality;
    }

    public String getAvTextureDetail() {
        return avTextureDetail;
    }

    public void setAvTextureDetail(String avTextureDetail) {
        this.avTextureDetail = avTextureDetail;
    }

    public String getAvEffectDetail() {
        return avEffectDetail;
    }

    public void setAvEffectDetail(String avEffectDetail) {
        this.avEffectDetail = avEffectDetail;
    }

    public String getAvShaderDetail() {
        return avShaderDetail;
    }

    public void setAvShaderDetail(String avShaderDetail) {
        this.avShaderDetail = avShaderDetail;
    }

    public String getAvBoostPlayerContrast() {
        return avBoostPlayerContrast;
    }

    public void setAvBoostPlayerContrast(String avBoostPlayerContrast) {
        this.avBoostPlayerContrast = avBoostPlayerContrast;
    }

    public String getAvMulticoreRendering() {
        return avMulticoreRendering;
    }

    public void setAvMulticoreRendering(String avMulticoreRendering) {
        this.avMulticoreRendering = avMulticoreRendering;
    }

    public String getAvMultisamplingAntiAliasingMode() {
        return avMultisamplingAntiAliasingMode;
    }

    public void setAvMultisamplingAntiAliasingMode(String avMultisamplingAntiAliasingMode) {
        this.avMultisamplingAntiAliasingMode = avMultisamplingAntiAliasingMode;
    }

    public String getAvFxaaAntiAliasing() {
        return avFxaaAntiAliasing;
    }

    public void setAvFxaaAntiAliasing(String avFxaaAntiAliasing) {
        this.avFxaaAntiAliasing = avFxaaAntiAliasing;
    }

    public String getAvTextureFilteringMode() {
        return avTextureFilteringMode;
    }

    public void setAvTextureFilteringMode(String avTextureFilteringMode) {
        this.avTextureFilteringMode = avTextureFilteringMode;
    }

    public String getAvWaitForVerticalSync() {
        return avWaitForVerticalSync;
    }

    public void setAvWaitForVerticalSync(String avWaitForVerticalSync) {
        this.avWaitForVerticalSync = avWaitForVerticalSync;
    }

    public String getAvMotionBlur() {
        return avMotionBlur;
    }

    public void setAvMotionBlur(String avMotionBlur) {
        this.avMotionBlur = avMotionBlur;
    }

    public String getAvTripleMonitorMode() {
        return avTripleMonitorMode;
    }

    public void setAvTripleMonitorMode(String avTripleMonitorMode) {
        this.avTripleMonitorMode = avTripleMonitorMode;
    }

    public String getAvUseUberShaders() {
        return avUseUberShaders;
    }

    public void setAvUseUberShaders(String avUseUberShaders) {
        this.avUseUberShaders = avUseUberShaders;
    }

    @Override
    public String toString() {
        return "ProCsgoAdvancedVideoSettings{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", avGlobalShadowQuality = " + avGlobalShadowQuality +
        ", avTextureDetail = " + avTextureDetail +
        ", avEffectDetail = " + avEffectDetail +
        ", avShaderDetail = " + avShaderDetail +
        ", avBoostPlayerContrast = " + avBoostPlayerContrast +
        ", avMulticoreRendering = " + avMulticoreRendering +
        ", avMultisamplingAntiAliasingMode = " + avMultisamplingAntiAliasingMode +
        ", avFxaaAntiAliasing = " + avFxaaAntiAliasing +
        ", avTextureFilteringMode = " + avTextureFilteringMode +
        ", avWaitForVerticalSync = " + avWaitForVerticalSync +
        ", avMotionBlur = " + avMotionBlur +
        ", avTripleMonitorMode = " + avTripleMonitorMode +
        ", avUseUberShaders = " + avUseUberShaders +
        "}";
    }
}
