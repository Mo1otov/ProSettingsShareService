package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoLaunchOptions;
import proSettingsShareService.service.IProCsgoLaunchOptionsService;
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
 * @since 2023-09-14
 */
@RestController//给前端返回json数据
@CrossOrigin//允许跨域请求
@RequestMapping("/proCsgoLaunchOptions")
public class ProCsgoLaunchOptionsController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoLaunchOptionsService proCsgoLaunchOptionsService;
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @GetMapping("/getProCsgoLaunchOptionsList")
    public TableResult<ProCsgoLaunchOptions> getProCsgoLaunchOptionsList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoLaunchOptions> proCsgoLaunchOptionsList =proCsgoLaunchOptionsService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoLaunchOptionsList.size(),proCsgoLaunchOptionsList);
        }else {
            Page<ProCsgoLaunchOptions> proCsgoLaunchOptionsPage = new Page<>(page, limit);
            Page<ProCsgoLaunchOptions> page1 = proCsgoLaunchOptionsService.page(proCsgoLaunchOptionsPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/updateProCsgoLaunchOptions")
    public TableResult<ProCsgoLaunchOptions> updateProCsgoLaunchOptions(ProCsgoLaunchOptions proCsgoLaunchOptions) {
        proCsgoLaunchOptionsService.updateById(proCsgoLaunchOptions);
        return TableResult.ok("修改该选手游戏启动参数信息成功！");
    }

    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/addProCsgoLaunchOptions")//映射的地址与方法名没有关系
    public TableResult<ProCsgoLaunchOptions> addProCsgoLaunchOptions(ProCsgoLaunchOptions proCsgoLaunchOptions) {
        proCsgoLaunchOptionsService.save(proCsgoLaunchOptions);
        return TableResult.ok("新增该选手游戏启动参数信息成功！");
    }

    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/deleteProCsgoLaunchOptions")//映射的地址与方法名没有关系
    public TableResult<ProCsgoLaunchOptions> deleteProCsgoLaunchOptions(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoLaunchOptionsService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手游戏启动参数信息成功！");
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @GetMapping("/getIds")//映射的地址与方法名没有关系
    public TableResult<ProBasicInfo> getIds() {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        List<ProBasicInfo> proBasicInfoList = proCsgoLaunchOptionsService.getIds();
        // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
        return TableResult.ok("查询成功",proBasicInfoList.size(),proBasicInfoList);
    }
}
