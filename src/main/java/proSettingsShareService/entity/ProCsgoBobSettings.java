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
@TableName("pro_csgo_bob_settings")
public class ProCsgoBobSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

    /**
     * 移动时手臂模型向身体靠近幅度
     */
    private Integer bobLowerAmt;

    /**
     * 移动时手臂模型左右晃动幅度
     */
    private Integer bobAmtLat;

    /**
     * 移动时手臂模型上下晃动幅度
     */
    private Integer bobAmtVert;

    /**
     * 手臂模型摆动
     */
    private Integer bobCycle;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getBobLowerAmt() {
        return bobLowerAmt;
    }

    public void setBobLowerAmt(Integer bobLowerAmt) {
        this.bobLowerAmt = bobLowerAmt;
    }

    public Integer getBobAmtLat() {
        return bobAmtLat;
    }

    public void setBobAmtLat(Integer bobAmtLat) {
        this.bobAmtLat = bobAmtLat;
    }

    public Integer getBobAmtVert() {
        return bobAmtVert;
    }

    public void setBobAmtVert(Integer bobAmtVert) {
        this.bobAmtVert = bobAmtVert;
    }

    public Integer getBobCycle() {
        return bobCycle;
    }

    public void setBobCycle(Integer bobCycle) {
        this.bobCycle = bobCycle;
    }

    @Override
    public String toString() {
        return "ProCsgoBobSettings{" +
        "proId = " + proId +
        ", bobLowerAmt = " + bobLowerAmt +
        ", bobAmtLat = " + bobAmtLat +
        ", bobAmtVert = " + bobAmtVert +
        ", bobCycle = " + bobCycle +
        "}";
    }
}
