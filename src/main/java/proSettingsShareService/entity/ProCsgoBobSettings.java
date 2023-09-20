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
@TableName("pro_csgo_bob_settings")
public class ProCsgoBobSettings implements Serializable {

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
     * 移动时手臂模型向身体靠近幅度
     */
    private Double bobLowerAmt;

    /**
     * 移动时手臂模型左右晃动幅度
     */
    private Double bobAmtLat;

    /**
     * 移动时手臂模型前后晃动幅度
     */
    private Double bobAmtVert;

    /**
     * 手臂模型摆动
     */
    private Double bobCycle;

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

    public Double getBobLowerAmt() {
        return bobLowerAmt;
    }

    public void setBobLowerAmt(Double bobLowerAmt) {
        this.bobLowerAmt = bobLowerAmt;
    }

    public Double getBobAmtLat() {
        return bobAmtLat;
    }

    public void setBobAmtLat(Double bobAmtLat) {
        this.bobAmtLat = bobAmtLat;
    }

    public Double getBobAmtVert() {
        return bobAmtVert;
    }

    public void setBobAmtVert(Double bobAmtVert) {
        this.bobAmtVert = bobAmtVert;
    }

    public Double getBobCycle() {
        return bobCycle;
    }

    public void setBobCycle(Double bobCycle) {
        this.bobCycle = bobCycle;
    }

    @Override
    public String toString() {
        return "ProCsgoBobSettings{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", bobLowerAmt = " + bobLowerAmt +
        ", bobAmtLat = " + bobAmtLat +
        ", bobAmtVert = " + bobAmtVert +
        ", bobCycle = " + bobCycle +
        "}";
    }
}
