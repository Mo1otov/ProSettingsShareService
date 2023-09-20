package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoBobSettings;
import proSettingsShareService.mapper.ProCsgoBobSettingsMapper;
import proSettingsShareService.service.IProCsgoBobSettingsService;
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
public class ProCsgoBobSettingsServiceImpl extends ServiceImpl<ProCsgoBobSettingsMapper, ProCsgoBobSettings> implements IProCsgoBobSettingsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
