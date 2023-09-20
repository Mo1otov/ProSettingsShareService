package proSettingsShareService.service;

import com.baomidou.mybatisplus.extension.service.IService;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoBobSettings;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
public interface IProCsgoBobSettingsService extends IService<ProCsgoBobSettings> {
    List<ProBasicInfo> getIds();
}
