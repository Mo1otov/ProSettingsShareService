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
@TableName("pro_csgo_viewmodel_settings")
public class ProCsgoViewmodelSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

    /**
     * 选手视图模型的fov
     */
    private Integer vlFov;

    /**
     * 选手视图模型的x轴偏移
     */
    private Integer vlOffsetX;

    /**
     * 选手视图模型的y轴偏移
     */
    private Integer vlOffsetY;

    /**
     * 选手视图模型的z轴偏移
     */
    private Integer vlOffsetZ;

    /**
     * 选手视图模型的持枪视角
     */
    private Integer vlPresetpos;

    /**
     * 选手视图模型的左移amt
     */
    private Integer vlShiftLeftAmt;

    /**
     * 选手视图模型的右移amt
     */
    private Integer vlShiftRightAmt;

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

    public Integer getVlFov() {
        return vlFov;
    }

    public void setVlFov(Integer vlFov) {
        this.vlFov = vlFov;
    }

    public Integer getVlOffsetX() {
        return vlOffsetX;
    }

    public void setVlOffsetX(Integer vlOffsetX) {
        this.vlOffsetX = vlOffsetX;
    }

    public Integer getVlOffsetY() {
        return vlOffsetY;
    }

    public void setVlOffsetY(Integer vlOffsetY) {
        this.vlOffsetY = vlOffsetY;
    }

    public Integer getVlOffsetZ() {
        return vlOffsetZ;
    }

    public void setVlOffsetZ(Integer vlOffsetZ) {
        this.vlOffsetZ = vlOffsetZ;
    }

    public Integer getVlPresetpos() {
        return vlPresetpos;
    }

    public void setVlPresetpos(Integer vlPresetpos) {
        this.vlPresetpos = vlPresetpos;
    }

    public Integer getVlShiftLeftAmt() {
        return vlShiftLeftAmt;
    }

    public void setVlShiftLeftAmt(Integer vlShiftLeftAmt) {
        this.vlShiftLeftAmt = vlShiftLeftAmt;
    }

    public Integer getVlShiftRightAmt() {
        return vlShiftRightAmt;
    }

    public void setVlShiftRightAmt(Integer vlShiftRightAmt) {
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
