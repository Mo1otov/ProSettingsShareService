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
@TableName("pro_csgo_crosshair_settings")
public class ProCsgoCrosshairSettings implements Serializable {

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
     * 是否启用准星轮廓(1表示true，0表示false)
     */
    private String crDrawoutline;

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
    private String crDot;

    /**
     * 准星间隙
     */
    private Double crGap;

    /**
     * 准星大小
     */
    private Double crSize;

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
    private Double crSniperWidth;

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

    public String getCrDrawoutline() {
        return crDrawoutline;
    }

    public void setCrDrawoutline(String crDrawoutline) {
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

    public String getCrDot() {
        return crDot;
    }

    public void setCrDot(String crDot) {
        this.crDot = crDot;
    }

    public Double getCrGap() {
        return crGap;
    }

    public void setCrGap(Double crGap) {
        this.crGap = crGap;
    }

    public Double getCrSize() {
        return crSize;
    }

    public void setCrSize(Double crSize) {
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

    public Double getCrSniperWidth() {
        return crSniperWidth;
    }

    public void setCrSniperWidth(Double crSniperWidth) {
        this.crSniperWidth = crSniperWidth;
    }

    @Override
    public String toString() {
        return "ProCsgoCrosshairSettings{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
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
