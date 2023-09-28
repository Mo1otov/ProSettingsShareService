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
@TableName("pro_csgo_pc_specs")
public class ProCsgoPcSpecs implements Serializable {

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
     * 主机的CPU型号
     */
    private String psProcessor;

    /**
     * 主机的GPU型号
     */
    private String psGraphicsCard;

    /**
     * 主机的主板型号
     */
    private String psMotherboard;

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

    public String getPsProcessor() {
        return psProcessor;
    }

    public void setPsProcessor(String psProcessor) {
        this.psProcessor = psProcessor;
    }

    public String getPsGraphicsCard() {
        return psGraphicsCard;
    }

    public void setPsGraphicsCard(String psGraphicsCard) {
        this.psGraphicsCard = psGraphicsCard;
    }

    public String getPsMotherboard() {
        return psMotherboard;
    }

    public void setPsMotherboard(String psMotherboard) {
        this.psMotherboard = psMotherboard;
    }
    @Override
    public String toString() {
        return "ProCsgoPcSpecs{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", psProcessor = " + psProcessor +
        ", psGraphicsCard = " + psGraphicsCard +
        ", psMotherboard = " + psMotherboard +
        "}";
    }
}
