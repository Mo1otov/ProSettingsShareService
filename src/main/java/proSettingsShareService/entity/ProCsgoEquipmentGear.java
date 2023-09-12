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
@TableName("pro_csgo_equipment_gear")
public class ProCsgoEquipmentGear implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

    /**
     * 显示器型号
     */
    private String gearMonitor;

    /**
     * 鼠标型号
     */
    private String gearMouse;

    /**
     * 键盘型号
     */
    private String gearKeyboard;

    /**
     * 头戴式耳机型号
     */
    private String gearHeadset;

    /**
     * 鼠标垫型号
     */
    private String gearMousepad;

    /**
     * 入耳式耳机型号
     */
    private String gearEarphones;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getGearMonitor() {
        return gearMonitor;
    }

    public void setGearMonitor(String gearMonitor) {
        this.gearMonitor = gearMonitor;
    }

    public String getGearMouse() {
        return gearMouse;
    }

    public void setGearMouse(String gearMouse) {
        this.gearMouse = gearMouse;
    }

    public String getGearKeyboard() {
        return gearKeyboard;
    }

    public void setGearKeyboard(String gearKeyboard) {
        this.gearKeyboard = gearKeyboard;
    }

    public String getGearHeadset() {
        return gearHeadset;
    }

    public void setGearHeadset(String gearHeadset) {
        this.gearHeadset = gearHeadset;
    }

    public String getGearMousepad() {
        return gearMousepad;
    }

    public void setGearMousepad(String gearMousepad) {
        this.gearMousepad = gearMousepad;
    }

    public String getGearEarphones() {
        return gearEarphones;
    }

    public void setGearEarphones(String gearEarphones) {
        this.gearEarphones = gearEarphones;
    }

    @Override
    public String toString() {
        return "ProCsgoEquipmentGear{" +
        "proId = " + proId +
        ", gearMonitor = " + gearMonitor +
        ", gearMouse = " + gearMouse +
        ", gearKeyboard = " + gearKeyboard +
        ", gearHeadset = " + gearHeadset +
        ", gearMousepad = " + gearMousepad +
        ", gearEarphones = " + gearEarphones +
        "}";
    }
}
