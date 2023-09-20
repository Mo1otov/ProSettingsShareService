package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoCrosshairSettings;
import proSettingsShareService.mapper.ProCsgoCrosshairSettingsMapper;
import proSettingsShareService.service.IProCsgoCrosshairSettingsService;
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
public class ProCsgoCrosshairSettingsServiceImpl extends ServiceImpl<ProCsgoCrosshairSettingsMapper, ProCsgoCrosshairSettings> implements IProCsgoCrosshairSettingsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
