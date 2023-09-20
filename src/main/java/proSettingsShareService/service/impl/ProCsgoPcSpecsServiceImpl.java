package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoPcSpecs;
import proSettingsShareService.mapper.ProCsgoPcSpecsMapper;
import proSettingsShareService.service.IProCsgoPcSpecsService;
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
public class ProCsgoPcSpecsServiceImpl extends ServiceImpl<ProCsgoPcSpecsMapper, ProCsgoPcSpecs> implements IProCsgoPcSpecsService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
