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
@TableName("pro_csgo_crosshair_settings")
public class ProCsgoCrosshairSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

    /**
     * 是否启用准星轮廓(1表示true，0表示false)
     */
    private Byte crDrawoutline;

    /**
     * 准星前置选择
     */
    private Integer crAlpha;

    /**
     * 准星颜色
     */
    private Integer crColor;

    /**
     * 准星蓝色数值
     */
    private Integer crBlue;

    /**
     * 准星绿色数值
     */
    private Integer crGreen;

    /**
     * 准星红色数值
     */
    private Integer crRed;

    /**
     * 准星是否启用中心点(1表示true，0表示false)
     */
    private Byte crDot;

    /**
     * 准星间隙
     */
    private Integer crGap;

    /**
     * 准星大小
     */
    private Integer crSize;

    /**
     * 准星风格
     */
    private Integer crStyle;

    /**
     * 准星厚度
     */
    private Integer crThickness;

    /**
     * 开镜准星宽度
     */
    private Integer crSniperWidth;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Byte getCrDrawoutline() {
        return crDrawoutline;
    }

    public void setCrDrawoutline(Byte crDrawoutline) {
        this.crDrawoutline = crDrawoutline;
    }

    public Integer getCrAlpha() {
        return crAlpha;
    }

    public void setCrAlpha(Integer crAlpha) {
        this.crAlpha = crAlpha;
    }

    public Integer getCrColor() {
        return crColor;
    }

    public void setCrColor(Integer crColor) {
        this.crColor = crColor;
    }

    public Integer getCrBlue() {
        return crBlue;
    }

    public void setCrBlue(Integer crBlue) {
        this.crBlue = crBlue;
    }

    public Integer getCrGreen() {
        return crGreen;
    }

    public void setCrGreen(Integer crGreen) {
        this.crGreen = crGreen;
    }

    public Integer getCrRed() {
        return crRed;
    }

    public void setCrRed(Integer crRed) {
        this.crRed = crRed;
    }

    public Byte getCrDot() {
        return crDot;
    }

    public void setCrDot(Byte crDot) {
        this.crDot = crDot;
    }

    public Integer getCrGap() {
        return crGap;
    }

    public void setCrGap(Integer crGap) {
        this.crGap = crGap;
    }

    public Integer getCrSize() {
        return crSize;
    }

    public void setCrSize(Integer crSize) {
        this.crSize = crSize;
    }

    public Integer getCrStyle() {
        return crStyle;
    }

    public void setCrStyle(Integer crStyle) {
        this.crStyle = crStyle;
    }

    public Integer getCrThickness() {
        return crThickness;
    }

    public void setCrThickness(Integer crThickness) {
        this.crThickness = crThickness;
    }

    public Integer getCrSniperWidth() {
        return crSniperWidth;
    }

    public void setCrSniperWidth(Integer crSniperWidth) {
        this.crSniperWidth = crSniperWidth;
    }

    @Override
    public String toString() {
        return "ProCsgoCrosshairSettings{" +
        "proId = " + proId +
        ", crDrawoutline = " + crDrawoutline +
        ", crAlpha = " + crAlpha +
        ", crColor = " + crColor +
        ", crBlue = " + crBlue +
        ", crGreen = " + crGreen +
        ", crRed = " + crRed +
        ", crDot = " + crDot +
        ", crGap = " + crGap +
        ", crSize = " + crSize +
        ", crStyle = " + crStyle +
        ", crThickness = " + crThickness +
        ", crSniperWidth = " + crSniperWidth +
        "}";
    }
}
