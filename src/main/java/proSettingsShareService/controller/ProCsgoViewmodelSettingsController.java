package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoVideoSettings;
import proSettingsShareService.entity.ProCsgoViewmodelSettings;
import proSettingsShareService.service.IProCsgoViewmodelSettingsService;
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
@RequestMapping("/proCsgoViewmodelSettings")
public class ProCsgoViewmodelSettingsController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoViewmodelSettingsService proCsgoViewmodelSettingsService;
    @GetMapping("/getProCsgoViewmodelSettingsList")
    public TableResult<ProCsgoViewmodelSettings> getProCsgoViewmodelSettingsList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoViewmodelSettings> proCsgoViewmodelSettingsList =proCsgoViewmodelSettingsService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoViewmodelSettingsList.size(),proCsgoViewmodelSettingsList);
        }else {
            Page<ProCsgoViewmodelSettings> proCsgoViewmodelSettingsPage = new Page<>(page, limit);
            Page<ProCsgoViewmodelSettings> page1 = proCsgoViewmodelSettingsService.page(proCsgoViewmodelSettingsPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @GetMapping("/getProCsgoViewmodelSettingsById")
    public TableResult<ProCsgoViewmodelSettings> getProCsgoViewmodelSettingsById(Integer proId) {
        ProCsgoViewmodelSettings proCsgoViewmodelSettings = proCsgoViewmodelSettingsService.getById(proId);
        return TableResult.ok("查询成功", proCsgoViewmodelSettings);
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/updateProCsgoViewmodelSettings")
    public TableResult<ProCsgoViewmodelSettings> updateProCsgoViewmodelSettings(ProCsgoViewmodelSettings proCsgoViewmodelSettings) {
        proCsgoViewmodelSettingsService.updateById(proCsgoViewmodelSettings);
        return TableResult.ok("修改该选手游戏内持枪视角信息成功！");
    }

    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/addProCsgoViewmodelSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoViewmodelSettings> addProCsgoViewmodelSettings(ProCsgoViewmodelSettings proCsgoViewmodelSettings) {
        proCsgoViewmodelSettingsService.save(proCsgoViewmodelSettings);
        return TableResult.ok("新增该选手游戏内持枪视角信息成功！");
    }

    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/deleteProCsgoViewmodelSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoViewmodelSettings> deleteProCsgoViewmodelSettings(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoViewmodelSettingsService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手游戏内持枪视角信息成功！");
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @GetMapping("/getIds")//映射的地址与方法名没有关系
    public TableResult<ProBasicInfo> getIds() {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        List<ProBasicInfo> proBasicInfoList = proCsgoViewmodelSettingsService.getIds();
        // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
        return TableResult.ok("查询成功",proBasicInfoList.size(),proBasicInfoList);
    }
}
