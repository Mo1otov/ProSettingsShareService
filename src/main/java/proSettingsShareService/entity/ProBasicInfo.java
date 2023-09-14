package proSettingsShareService.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
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
     * 选手姓名
     */
    private String proName;

    /**
     * 选手所属国家
     */
    private String proCountry;

    /**
     * 选手生日
     */
    private String proBirthday;

    /**
     * 选手简介
     */
    private String proProfile;

    /**
     * 选手游戏id
     */
    private String proGameId;

    /**
     * 选手所属战队
     */
    private String proClan;

    /**
     * 选手玩的游戏
     */
    private String proPlayGame;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProCountry() {
        return proCountry;
    }

    public void setProCountry(String proCountry) {
        this.proCountry = proCountry;
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

    public String getProGameId() {
        return proGameId;
    }

    public void setProGameId(String proGameId) {
        this.proGameId = proGameId;
    }

    public String getProClan() {
        return proClan;
    }

    public void setProClan(String proClan) {
        this.proClan = proClan;
    }

    public String getProPlayGame() {
        return proPlayGame;
    }

    public void setProPlayGame(String proPlayGame) {
        this.proPlayGame = proPlayGame;
    }

    @Override
    public String toString() {
        return "ProBasicInfo{" +
        "proId = " + proId +
        ", proName = " + proName +
        ", proCountry = " + proCountry +
        ", proBirthday = " + proBirthday +
        ", proProfile = " + proProfile +
        ", proGameId = " + proGameId +
        ", proClan = " + proClan +
        ", proPlayGame = " + proPlayGame +
        "}";
    }
}
