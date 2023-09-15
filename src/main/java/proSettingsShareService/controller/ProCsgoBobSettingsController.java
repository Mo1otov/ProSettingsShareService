package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import proSettingsShareService.entity.ProCsgoAdvancedVideoSettings;
import proSettingsShareService.entity.ProCsgoBobSettings;
import proSettingsShareService.service.IProCsgoAdvancedVideoSettingsService;
import proSettingsShareService.service.IProCsgoBobSettingsService;
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
@RequestMapping("/proCsgoBobSettings")
public class ProCsgoBobSettingsController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoBobSettingsService proCsgoBobSettingsService;
    @Auth(roles = {"ADMIN"})
    @GetMapping("/getProCsgoBobSettingsList")
    public TableResult<ProCsgoBobSettings> getProCsgoBobSettingsList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoBobSettings> proCsgoBobSettingsList =proCsgoBobSettingsService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoBobSettingsList.size(),proCsgoBobSettingsList);
        }else {
            Page<ProCsgoBobSettings> proCsgoBobSettings = new Page<>(page, limit);
            Page<ProCsgoBobSettings> page1 = proCsgoBobSettingsService.page(proCsgoBobSettings); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @Auth(roles = {"ADMIN"})
    @PostMapping("/updateProCsgoBobSettings")
    public TableResult<ProCsgoBobSettings> updateProCsgoBobSettings(ProCsgoBobSettings proCsgoBobSettings) {
        proCsgoBobSettingsService.updateById(proCsgoBobSettings);
        return TableResult.ok("修改该选手游戏内手臂晃动信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/addProCsgoBobSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoBobSettings> addProCsgoBobSettings(ProCsgoBobSettings proCsgoBobSettings) {
        proCsgoBobSettingsService.save(proCsgoBobSettings);
        return TableResult.ok("新增该选手游戏内手臂晃动信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/deleteProCsgoBobSettings")//映射的地址与方法名没有关系
    public TableResult<ProCsgoBobSettings> deleteProCsgoBobSettings(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoBobSettingsService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手游戏内手臂晃动信息成功！");
    }
}
