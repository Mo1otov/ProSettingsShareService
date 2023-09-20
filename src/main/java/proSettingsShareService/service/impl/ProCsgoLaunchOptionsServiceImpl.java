package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoLaunchOptions;
import proSettingsShareService.mapper.ProCsgoLaunchOptionsMapper;
import proSettingsShareService.service.IProCsgoLaunchOptionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mxw
 * @since 2023-09-14
 */
@Service
public class ProCsgoLaunchOptionsServiceImpl extends ServiceImpl<ProCsgoLaunchOptionsMapper, ProCsgoLaunchOptions> implements IProCsgoLaunchOptionsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
