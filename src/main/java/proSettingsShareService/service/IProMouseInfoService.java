package proSettingsShareService.service;

import com.baomidou.mybatisplus.extension.service.IService;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProMouseInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
public interface IProMouseInfoService extends IService<ProMouseInfo> {
    List<ProBasicInfo> getIds();
}
