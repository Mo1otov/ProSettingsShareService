package proSettingsShareService.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoAdvancedVideoSettings;

import javax.annotation.sql.DataSourceDefinition;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
public interface ProCsgoAdvancedVideoSettingsMapper extends BaseMapper<ProCsgoAdvancedVideoSettings> {
    @Select("select * from pro_basic_info where pro_id not in (select pro_id from pro_csgo_advanced_video_settings)")
    List<ProBasicInfo> getIds();
}
