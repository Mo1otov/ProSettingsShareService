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
@TableName("pro_csgo_pc_specs")
public class ProCsgoPcSpecs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

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

    /**
     * 麦克风型号
     */
    private String psMicrophone;

    /**
     * 摄像头型号
     */
    private String psWebcam;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
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

    public String getPsMicrophone() {
        return psMicrophone;
    }

    public void setPsMicrophone(String psMicrophone) {
        this.psMicrophone = psMicrophone;
    }

    public String getPsWebcam() {
        return psWebcam;
    }

    public void setPsWebcam(String psWebcam) {
        this.psWebcam = psWebcam;
    }

    @Override
    public String toString() {
        return "ProCsgoPcSpecs{" +
        "proId = " + proId +
        ", psProcessor = " + psProcessor +
        ", psGraphicsCard = " + psGraphicsCard +
        ", psMotherboard = " + psMotherboard +
        ", psMicrophone = " + psMicrophone +
        ", psWebcam = " + psWebcam +
        "}";
    }
}
