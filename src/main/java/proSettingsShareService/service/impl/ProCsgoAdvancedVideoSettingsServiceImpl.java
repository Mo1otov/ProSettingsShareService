package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoAdvancedVideoSettings;
import proSettingsShareService.mapper.ProCsgoAdvancedVideoSettingsMapper;
import proSettingsShareService.service.IProCsgoAdvancedVideoSettingsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
@Service
public class ProCsgoAdvancedVideoSettingsServiceImpl extends ServiceImpl<ProCsgoAdvancedVideoSettingsMapper, ProCsgoAdvancedVideoSettings> implements IProCsgoAdvancedVideoSettingsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
