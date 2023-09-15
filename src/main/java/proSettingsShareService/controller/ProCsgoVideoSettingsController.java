package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProCsgoVideoSettings;
import proSettingsShareService.service.IProCsgoVideoSettingsService;
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
@RequestMapping("/proCsgoVideoSettings")
public class ProCsgoVideoSettingsController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoVideoSettingsService proCsgoVideoSettingsService;
    @Auth(roles = {"ADMIN"})
    @GetMapping("/getProCsgoVideoSettingsList")
    public TableResult<ProCsgoVideoSettings> getProCsgoVideoSettingsList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoVideoSettings> proCsgoVideoSettingsList =proCsgoVideoSettingsService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoVideoSettingsList.size(),proCsgoVideoSettingsList);
        }else {
            Page<ProCsgoVideoSettings> proCsgoVideoSettingsPage = new Page<>(page, limit);
            Page<ProCsgoVideoSettings> page1 = proCsgoVideoSettingsService.page(proCsgoVideoSettingsPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @Auth(roles = {"ADMIN"})
    @PostMapping("/updateProCsgoVideoSettings")
    public TableResult<ProCsgoVideoSettings> updateProCsgoVideoSettings(ProCsgoVideoSettings proCsgoVideoSettings) {
        proCsgoVideoSettingsService.updateById(proCsgoVideoSettings);
        return TableResult.ok("修改该选手游戏内视频设置信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/addProCsgoVideoSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoVideoSettings> addProCsgoVideoSettings(ProCsgoVideoSettings proCsgoVideoSettings) {
        proCsgoVideoSettingsService.save(proCsgoVideoSettings);
        return TableResult.ok("新增该选手游戏内视频设置信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/deleteProCsgoVideoSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoVideoSettings> deleteProCsgoVideoSettings(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoVideoSettingsService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手游戏内视频设置信息成功！");
    }
}
