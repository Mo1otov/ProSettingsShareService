package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoViewmodelSettings;
import proSettingsShareService.mapper.ProCsgoViewmodelSettingsMapper;
import proSettingsShareService.service.IProCsgoViewmodelSettingsService;
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
public class ProCsgoViewmodelSettingsServiceImpl extends ServiceImpl<ProCsgoViewmodelSettingsMapper, ProCsgoViewmodelSettings> implements IProCsgoViewmodelSettingsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
