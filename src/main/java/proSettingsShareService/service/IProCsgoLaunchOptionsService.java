package proSettingsShareService.service;

import com.baomidou.mybatisplus.extension.service.IService;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoLaunchOptions;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mxw
 * @since 2023-09-14
 */
public interface IProCsgoLaunchOptionsService extends IService<ProCsgoLaunchOptions> {
    List<ProBasicInfo> getIds();
}
