package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoLaunchOptions;
import proSettingsShareService.entity.ProCsgoPcSpecs;
import proSettingsShareService.service.IProCsgoPcSpecsService;
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
@RequestMapping("/proCsgoPcSpecs")
public class ProCsgoPcSpecsController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoPcSpecsService proCsgoPcSpecsService;
    @GetMapping("/getProCsgoPcSpecsList")
    public TableResult<ProCsgoPcSpecs> getProCsgoPcSpecsList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoPcSpecs> proCsgoPcSpecsList =proCsgoPcSpecsService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoPcSpecsList.size(),proCsgoPcSpecsList);
        }else {
            Page<ProCsgoPcSpecs> proCsgoPcSpecsPage = new Page<>(page, limit);
            Page<ProCsgoPcSpecs> page1 = proCsgoPcSpecsService.page(proCsgoPcSpecsPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @GetMapping("/getProCsgoPcSpecsById")
    public TableResult<ProCsgoPcSpecs> getProCsgoPcSpecsById(Integer proId) {
        ProCsgoPcSpecs proCsgoPcSpecs = proCsgoPcSpecsService.getById(proId);
        return TableResult.ok("查询成功", proCsgoPcSpecs);
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/updateProCsgoPcSpecs")
    public TableResult<ProCsgoPcSpecs> updateProCsgoPcSpecs(ProCsgoPcSpecs proCsgoPcSpecs) {
        proCsgoPcSpecsService.updateById(proCsgoPcSpecs);
        return TableResult.ok("修改该选手主机配置信息成功！");
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/addProCsgoPcSpecs")//映射的地址与方法名没有关系
    public TableResult<ProCsgoPcSpecs> addProCsgoPcSpecs(ProCsgoPcSpecs proCsgoPcSpecs) {
        proCsgoPcSpecsService.save(proCsgoPcSpecs);
        return TableResult.ok("新增该选手主机配置信息成功！");
    }

    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @PostMapping("/deleteProCsgoPcSpecs")//映射的地址与方法名没有关系
    public TableResult<ProCsgoPcSpecs> deleteProCsgoPcSpecs(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoPcSpecsService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手主机配置信息成功！");
    }
    @Auth(roles = {"ADMIN","EXECUTIVE"})
    @GetMapping("/getIds")//映射的地址与方法名没有关系
    public TableResult<ProBasicInfo> getIds() {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        List<ProBasicInfo> proBasicInfoList = proCsgoPcSpecsService.getIds();
        // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
        return TableResult.ok("查询成功",proBasicInfoList.size(),proBasicInfoList);
    }
}
