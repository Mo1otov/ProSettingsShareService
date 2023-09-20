package proSettingsShareService.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoEquipmentGear;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
public interface IProCsgoEquipmentGearService extends IService<ProCsgoEquipmentGear> {
    List<ProBasicInfo> getIds();
}
