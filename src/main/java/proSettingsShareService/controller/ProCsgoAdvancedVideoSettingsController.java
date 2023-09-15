package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProCsgoAdvancedVideoSettings;
import proSettingsShareService.service.IProCsgoAdvancedVideoSettingsService;
import proSettingsShareService.util.Auth;
import proSettingsShareService.util.TableResult;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
@RestController//给前端返回json数据
@CrossOrigin//允许跨域请求
@RequestMapping("/proCsgoAdvancedVideoSettings")
public class ProCsgoAdvancedVideoSettingsController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoAdvancedVideoSettingsService proCsgoAdvancedVideoSettingsService;
    @Auth(roles = {"ADMIN"})
    @GetMapping("/getProCsgoAdvancedVideoSettingsList")
    public TableResult<ProCsgoAdvancedVideoSettings> getProCsgoAdvancedVideoSettingsList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoAdvancedVideoSettings> proCsgoAdvancedVideoSettingsList = proCsgoAdvancedVideoSettingsService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoAdvancedVideoSettingsList.size(),proCsgoAdvancedVideoSettingsList);
        }else {
            Page<ProCsgoAdvancedVideoSettings> proCsgoAdvancedVideoSettingsPage = new Page<>(page, limit);
            Page<ProCsgoAdvancedVideoSettings> page1 = proCsgoAdvancedVideoSettingsService.page(proCsgoAdvancedVideoSettingsPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @Auth(roles = {"ADMIN"})
    @PostMapping("/updateProCsgoAdvancedVideoSettings")
    public TableResult<ProCsgoAdvancedVideoSettings> updateProCsgoAdvancedVideoSettings(ProCsgoAdvancedVideoSettings proCsgoAdvancedVideoSettings) {
        proCsgoAdvancedVideoSettingsService.updateById(proCsgoAdvancedVideoSettings);
        return TableResult.ok("修改该选手高级视频设置信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/addProCsgoAdvancedVideoSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoAdvancedVideoSettings> addProCsgoAdvancedVideoSettings(ProCsgoAdvancedVideoSettings proCsgoAdvancedVideoSettings) {
        proCsgoAdvancedVideoSettingsService.save(proCsgoAdvancedVideoSettings);
        return TableResult.ok("新增该选手高级视频设置信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/deleteProCsgoAdvancedVideoSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoAdvancedVideoSettings> deleteProCsgoAdvancedVideoSettings(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoAdvancedVideoSettingsService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手高级视频设置信息成功！");
    }

}
