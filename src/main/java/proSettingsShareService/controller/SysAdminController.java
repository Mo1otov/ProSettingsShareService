package proSettingsShareService.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.entity.SysAdmin;
import proSettingsShareService.service.ISysAdminService;
import proSettingsShareService.util.Auth;
import proSettingsShareService.util.JWTUtil;
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
@RestController
@CrossOrigin
@RequestMapping("/sysAdmin")
public class SysAdminController {
    @Autowired
    private ISysAdminService sysAdminService;
    @Autowired
    private JWTUtil jwtUtil;
    @PostMapping("/login")
    public TableResult<SysAdmin> login(SysAdmin sysAdmin) {
        //查询多条件为等于关系
        QueryWrapper<SysAdmin> wrapper = new QueryWrapper<>(sysAdmin);
        SysAdmin sysAdmin1 = sysAdminService.getOne(wrapper);
        if (sysAdmin1 != null) {
            String token = jwtUtil.createJwt(sysAdmin1);
            return TableResult.ok(token, sysAdmin1);
        } else {
            return TableResult.error(1, "用户名或密码错误");
        }
    }
    @Auth(roles = {"EXECUTIVE"})
    @GetMapping("/getSysAdminList")
    public TableResult<SysAdmin> getSysAdminList(Integer limit, Integer page, HttpServletRequest request){
        if(limit ==null && page == null){
            List<SysAdmin> sysAdminList = sysAdminService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功",sysAdminList.size(),sysAdminList);
        }else {
            Page<SysAdmin> sysUserPage = new Page<>(page, limit);
            Page<SysAdmin> page1 = sysAdminService.page(sysUserPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }
    @Auth(roles = {"EXECUTIVE"})
    @PostMapping("/updateSysAdmin")
    public TableResult<SysAdmin> updateSysAdmin(SysAdmin sysAdmin) {
        sysAdminService.updateById(sysAdmin);
        return TableResult.ok("修改该管理员成功！");
    }

    @Auth(roles = {"EXECUTIVE"})
    @PostMapping("/addSysAdmin")//映射的地址与方法名没有关系
    public TableResult<SysAdmin> addSysAdmin(SysAdmin sysAdmin) {
        sysAdminService.save(sysAdmin);
        return TableResult.ok("新增管理员账户信息成功！");
    }

    @Auth(roles = {"EXECUTIVE"})
    @PostMapping("/deleteSysAdmin")//映射的地址与方法名没有关系
    public TableResult<SysAdmin> deleteSysAdmin(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        sysAdminService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除管理员账号成功！");
    }

}
