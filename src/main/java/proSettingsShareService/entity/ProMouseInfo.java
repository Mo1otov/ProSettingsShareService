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
@TableName("pro_mouse_info")
public class ProMouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选手id
     */
    private Integer proId;

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
    private Integer msSensitivity;

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
    private Byte msRawInput;

    /**
     * 是否开启鼠标加速(1表示true,0表示false)
     */
    private Byte msMouseAcceleration;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
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

    public Integer getMsSensitivity() {
        return msSensitivity;
    }

    public void setMsSensitivity(Integer msSensitivity) {
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

    public Byte getMsRawInput() {
        return msRawInput;
    }

    public void setMsRawInput(Byte msRawInput) {
        this.msRawInput = msRawInput;
    }

    public Byte getMsMouseAcceleration() {
        return msMouseAcceleration;
    }

    public void setMsMouseAcceleration(Byte msMouseAcceleration) {
        this.msMouseAcceleration = msMouseAcceleration;
    }

    @Override
    public String toString() {
        return "ProMouseInfo{" +
        "proId = " + proId +
        ", msMouseModel = " + msMouseModel +
        ", msDpi = " + msDpi +
        ", msSensitivity = " + msSensitivity +
        ", msEdpi = " + msEdpi +
        ", msZoomSensitivity = " + msZoomSensitivity +
        ", msHz = " + msHz +
        ", msWindowsSensitivity = " + msWindowsSensitivity +
        ", msRawInput = " + msRawInput +
        ", msMouseAcceleration = " + msMouseAcceleration +
        "}";
    }
}
