package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoVideoSettings;
import proSettingsShareService.mapper.ProCsgoVideoSettingsMapper;
import proSettingsShareService.service.IProCsgoVideoSettingsService;
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
public class ProCsgoVideoSettingsServiceImpl extends ServiceImpl<ProCsgoVideoSettingsMapper, ProCsgoVideoSettings> implements IProCsgoVideoSettingsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
