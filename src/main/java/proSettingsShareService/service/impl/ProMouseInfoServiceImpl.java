package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProMouseInfo;
import proSettingsShareService.mapper.ProMouseInfoMapper;
import proSettingsShareService.service.IProMouseInfoService;
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
public class ProMouseInfoServiceImpl extends ServiceImpl<ProMouseInfoMapper, ProMouseInfo> implements IProMouseInfoService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
