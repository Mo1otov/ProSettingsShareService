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
@TableName("pro_csgo_viewmodel_settings")
public class ProCsgoViewmodelSettings implements Serializable {

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
     * 选手视图模型的fov
     */
    private Double vlFov;

    /**
     * 选手视图模型的x轴偏移
     */
    private Double vlOffsetX;

    /**
     * 选手视图模型的y轴偏移
     */
    private Double vlOffsetY;

    /**
     * 选手视图模型的z轴偏移
     */
    private Double vlOffsetZ;

    /**
     * 选手视图模型的持枪视角
     */
    private Integer vlPresetpos;

    /**
     * 选手视图模型的左移amt
     */
    private Double vlShiftLeftAmt;

    /**
     * 选手视图模型的右移amt
     */
    private Double vlShiftRightAmt;

    /**
     * 选手视图模型是否开启后座力晃动(1表示开启,0表示关闭)
     */
    private Byte vlRecoil;

    /**
     * 选手视图模型持枪是否为右手(1表示开启,0表示关闭)
     */
    private Byte vlRighthand;

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

    public Double getVlFov() {
        return vlFov;
    }

    public void setVlFov(Double vlFov) {
        this.vlFov = vlFov;
    }

    public Double getVlOffsetX() {
        return vlOffsetX;
    }

    public void setVlOffsetX(Double vlOffsetX) {
        this.vlOffsetX = vlOffsetX;
    }

    public Double getVlOffsetY() {
        return vlOffsetY;
    }

    public void setVlOffsetY(Double vlOffsetY) {
        this.vlOffsetY = vlOffsetY;
    }

    public Double getVlOffsetZ() {
        return vlOffsetZ;
    }

    public void setVlOffsetZ(Double vlOffsetZ) {
        this.vlOffsetZ = vlOffsetZ;
    }

    public Integer getVlPresetpos() {
        return vlPresetpos;
    }

    public void setVlPresetpos(Integer vlPresetpos) {
        this.vlPresetpos = vlPresetpos;
    }

    public Double getVlShiftLeftAmt() {
        return vlShiftLeftAmt;
    }

    public void setVlShiftLeftAmt(Double vlShiftLeftAmt) {
        this.vlShiftLeftAmt = vlShiftLeftAmt;
    }

    public Double getVlShiftRightAmt() {
        return vlShiftRightAmt;
    }

    public void setVlShiftRightAmt(Double vlShiftRightAmt) {
        this.vlShiftRightAmt = vlShiftRightAmt;
    }

    public Byte getVlRecoil() {
        return vlRecoil;
    }

    public void setVlRecoil(Byte vlRecoil) {
        this.vlRecoil = vlRecoil;
    }

    public Byte getVlRighthand() {
        return vlRighthand;
    }

    public void setVlRighthand(Byte vlRighthand) {
        this.vlRighthand = vlRighthand;
    }

    @Override
    public String toString() {
        return "ProCsgoViewmodelSettings{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", vlFov = " + vlFov +
        ", vlOffsetX = " + vlOffsetX +
        ", vlOffsetY = " + vlOffsetY +
        ", vlOffsetZ = " + vlOffsetZ +
        ", vlPresetpos = " + vlPresetpos +
        ", vlShiftLeftAmt = " + vlShiftLeftAmt +
        ", vlShiftRightAmt = " + vlShiftRightAmt +
        ", vlRecoil = " + vlRecoil +
        ", vlRighthand = " + vlRighthand +
        "}";
    }
}
