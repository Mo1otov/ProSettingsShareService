package proSettingsShareService.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoViewmodelSettings;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
public interface ProCsgoViewmodelSettingsMapper extends BaseMapper<ProCsgoViewmodelSettings> {
    @Select("select * from pro_basic_info where pro_id not in (select pro_id from pro_csgo_viewmodel_settings)")
    List<ProBasicInfo> getIds();

}
