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
 * @since 2023-09-30
 */
@TableName("gear_map")
public class GearMap implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "gear_id", type = IdType.AUTO)
    private Integer gearId;

    /**
     * 外设类型
     */
    private String gearType;

    /**
     * 外设名
     */
    private String gearName;

    /**
     * 外设图片
     */
    private byte[] gearImg;

    public Integer getGearId() {
        return gearId;
    }

    public void setGearId(Integer gearId) {
        this.gearId = gearId;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getGearName() {
        return gearName;
    }

    public void setGearName(String gearName) {
        this.gearName = gearName;
    }

    public byte[] getGearImg() {
        return gearImg;
    }

    public void setGearImg(byte[] gearImg) {
        this.gearImg = gearImg;
    }

    @Override
    public String toString() {
        return "GearMap{" +
        "gearId = " + gearId +
        ", gearType = " + gearType +
        ", gearName = " + gearName +
        ", gearImg = " + gearImg +
        "}";
    }
}
