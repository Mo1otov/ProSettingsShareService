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
@TableName("pro_csgo_equipment_gear")
public class ProCsgoEquipmentGear implements Serializable {

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

    @Override
    public String toString() {
        return "ProCsgoEquipmentGear{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", gearMonitor = " + gearMonitor +
        ", gearMouse = " + gearMouse +
        ", gearKeyboard = " + gearKeyboard +
        ", gearHeadset = " + gearHeadset +
        ", gearMousepad = " + gearMousepad +
        "}";
    }
}
