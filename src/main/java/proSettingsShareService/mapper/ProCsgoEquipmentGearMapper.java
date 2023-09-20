package proSettingsShareService.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoEquipmentGear;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
@Mapper
public interface ProCsgoEquipmentGearMapper extends BaseMapper<ProCsgoEquipmentGear> {
    @Select("SELECT * FROM pro_basic_info WHERE pro_id NOT IN (SELECT pro_id FROM pro_csgo_equipment_gear)")
    List<ProBasicInfo> getIds();

}
