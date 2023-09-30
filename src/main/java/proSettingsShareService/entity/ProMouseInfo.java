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
@TableName("pro_mouse_info")
public class ProMouseInfo implements Serializable {

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
     * 鼠标型号
     */
    private String msMouseModel;

    /**
     * 鼠标dpi
     */
    private Integer msDpi;

    /**
     * 鼠标敏感度
     */
    private Double msSensitivity;

    /**
     * 鼠标edpi
     */
    private Integer msEdpi;

    /**
     * 鼠标开镜灵敏度
     */
    private Integer msZoomSensitivity;

    /**
     * 鼠标轮询率
     */
    private Integer msHz;

    /**
     * windows桌面鼠标灵敏度
     */
    private Integer msWindowsSensitivity;

    /**
     * 是否开启原始输入(1表示true,0表示false)
     */
    private String msRawInput;

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

    public String getMsMouseModel() {
        return msMouseModel;
    }

    public void setMsMouseModel(String msMouseModel) {
        this.msMouseModel = msMouseModel;
    }

    public Integer getMsDpi() {
        return msDpi;
    }

    public void setMsDpi(Integer msDpi) {
        this.msDpi = msDpi;
    }

    public Double getMsSensitivity() {
        return msSensitivity;
    }

    public void setMsSensitivity(Double msSensitivity) {
        this.msSensitivity = msSensitivity;
    }

    public Integer getMsEdpi() {
        return msEdpi;
    }

    public void setMsEdpi(Integer msEdpi) {
        this.msEdpi = msEdpi;
    }

    public Integer getMsZoomSensitivity() {
        return msZoomSensitivity;
    }

    public void setMsZoomSensitivity(Integer msZoomSensitivity) {
        this.msZoomSensitivity = msZoomSensitivity;
    }

    public Integer getMsHz() {
        return msHz;
    }

    public void setMsHz(Integer msHz) {
        this.msHz = msHz;
    }

    public Integer getMsWindowsSensitivity() {
        return msWindowsSensitivity;
    }

    public void setMsWindowsSensitivity(Integer msWindowsSensitivity) {
        this.msWindowsSensitivity = msWindowsSensitivity;
    }

    public String getMsRawInput() {
        return msRawInput;
    }

    public void setMsRawInput(String msRawInput) {
        this.msRawInput = msRawInput;
    }

    @Override
    public String toString() {
        return "ProMouseInfo{" +
        "proId = " + proId +
        ", proGameId = " + proGameId +
        ", msMouseModel = " + msMouseModel +
        ", msDpi = " + msDpi +
        ", msSensitivity = " + msSensitivity +
        ", msEdpi = " + msEdpi +
        ", msZoomSensitivity = " + msZoomSensitivity +
        ", msHz = " + msHz +
        ", msWindowsSensitivity = " + msWindowsSensitivity +
        ", msRawInput = " + msRawInput +
        "}";
    }
}
