package proSettingsShareService.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.File;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author mxw
 * @since 2023-09-15
 */
@TableName("pro_basic_info")
public class ProBasicInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手标识id
     */
    @TableId(value = "pro_id", type = IdType.AUTO)
    private Integer proId;

    /**
     * 选手游戏id
     */
    private String proGameId;

    /**
     * 选手照片
     */
    private byte[] proImg;

    /**
     * 选手所属战队
     */
    private String proClan;

    /**
     * 选手所属国家
     */
    private String proCountry;

    /**
     * 选手姓名
     */
    private String proName;

    /**
     * 选手生日
     */
    private String proBirthday;
    /**
     * 选手简介
     */
    private String proProfile;

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

    public byte[] getProImg() {
        return proImg;
    }

    public void setProImg(byte[] proImg) {
        this.proImg = proImg;
    }

    public String getProClan() {
        return proClan;
    }

    public void setProClan(String proClan) {
        this.proClan = proClan;
    }

    public String getProCountry() {
        return proCountry;
    }

    public void setProCountry(String proCountry) {
        this.proCountry = proCountry;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProBirthday() {
        return proBirthday;
    }

    public void setProBirthday(String proBirthday) {
        this.proBirthday = proBirthday;
    }

    public String getProProfile() {
        return proProfile;
    }

    public void setProProfile(String proProfile) {
        this.proProfile = proProfile;
    }

    @Override
    public String toString() {
        return "ProBasicInfo{" +
                "proId = " + proId +
                ", proGameId = " + proGameId +
                ", proClan = " + proClan +
                ", proCountry = " + proCountry +
                ", proName = " + proName +
                ", proBirthday = " + proBirthday +
                ", proProfile = " + proProfile +
                "}";
    }
}
