package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.ProCsgoEquipmentGear;
import proSettingsShareService.service.IProCsgoEquipmentGearService;
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
@RequestMapping("/proCsgoEquipmentGear")
public class ProCsgoEquipmentGearController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProCsgoEquipmentGearService proCsgoEquipmentGearService;
    @Auth(roles = {"ADMIN"})
    @GetMapping("/getProCsgoEquipmentGearList")
    public TableResult<ProCsgoEquipmentGear> getProCsgoEquipmentGearList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<ProCsgoEquipmentGear> proCsgoEquipmentGearList =proCsgoEquipmentGearService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proCsgoEquipmentGearList.size(),proCsgoEquipmentGearList);
        }else {
            Page<ProCsgoEquipmentGear> proCsgoEquipmentGearPage = new Page<>(page, limit);
            Page<ProCsgoEquipmentGear> page1 = proCsgoEquipmentGearService.page(proCsgoEquipmentGearPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @Auth(roles = {"ADMIN"})
    @PostMapping("/updateProCsgoEquipmentGear")
    public TableResult<ProCsgoEquipmentGear> updateProCsgoEquipmentGear(ProCsgoEquipmentGear proCsgoEquipmentGear) {
        proCsgoEquipmentGearService.updateById(proCsgoEquipmentGear);
        return TableResult.ok("修改该选手外设信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/addProCsgoEquipmentGear")//映射的地址与方法名没有关系
    public TableResult<ProCsgoEquipmentGear> addProCsgoEquipmentGear(ProCsgoEquipmentGear proCsgoEquipmentGear) {
        proCsgoEquipmentGearService.save(proCsgoEquipmentGear);
        return TableResult.ok("新增该选手外设信息成功！");
    }

    @Auth(roles = {"ADMIN"})
    @PostMapping("/deleteProCsgoEquipmentGear")//映射的地址与方法名没有关系
    public TableResult<ProCsgoEquipmentGear> deleteProCsgoEquipmentGear(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proCsgoEquipmentGearService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手外设信息成功！");
    }
    @Auth(roles = {"ADMIN"})
    @GetMapping("/getIds")//映射的地址与方法名没有关系
    public TableResult<ProBasicInfo> getIds() {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
            List<ProBasicInfo> proBasicInfoList = proCsgoEquipmentGearService.getIds();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",proBasicInfoList.size(),proBasicInfoList);
    }
}
