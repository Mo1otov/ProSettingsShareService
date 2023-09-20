package proSettingsShareService.service.impl;

import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoEquipmentGear;
import proSettingsShareService.mapper.ProCsgoEquipmentGearMapper;
import proSettingsShareService.service.IProCsgoEquipmentGearService;
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
public class ProCsgoEquipmentGearServiceImpl extends ServiceImpl<ProCsgoEquipmentGearMapper, ProCsgoEquipmentGear> implements IProCsgoEquipmentGearService {
    @Override
    public List<ProBasicInfo> getIds() {
        return  baseMapper.getIds();
    }
}
