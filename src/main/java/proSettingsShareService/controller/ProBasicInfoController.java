package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.ProBasicInfo;
import proSettingsShareService.service.IProBasicInfoService;
import proSettingsShareService.util.Auth;
import proSettingsShareService.util.TableResult;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mxw
 * @since 2023-09-13
 */
@RestController//给前端返回json数据
@RequestMapping("/proBasicInfo")
@CrossOrigin//允许跨域请求
public class ProBasicInfoController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IProBasicInfoService proBasicInfoService;

    @GetMapping("/getProBasicInfoList")
    public TableResult<ProBasicInfo> getProBasicInfoList(Integer limit, Integer page, HttpServletRequest request) {
        if (limit == null && page == null) {
            List<ProBasicInfo> proBasicInfoList = proBasicInfoService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", proBasicInfoList.size(), proBasicInfoList);
        } else {
            Page<ProBasicInfo> proBasicInfoPage = new Page<>(page, limit);
            Page<ProBasicInfo> page1 = proBasicInfoService.page(proBasicInfoPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }

    @GetMapping("/getProBasicInfoById")
    public TableResult<ProBasicInfo> getProBasicInfoById(Integer proId) {
        ProBasicInfo proBasicInfo = proBasicInfoService.getById(proId);
        return TableResult.ok("查询成功", proBasicInfo);
    }

    @Auth(roles = {"ADMIN", "EXECUTIVE"})
    @PostMapping("/updateProBasicInfo")
    public TableResult<ProBasicInfo> updateProBasicInfo(ProBasicInfo proBasicInfo) {
        String base64 = new String(proBasicInfo.getProImg());
        try {
            base64 = base64.split(",")[1];//通过base64来转化图片,去掉图片头(data:image/jpg;base64,)
            //2,解码成字节数组
            byte[] result = Base64.decodeBase64(base64);
            proBasicInfo.setProImg(result);
            proBasicInfoService.updateById(proBasicInfo);
            return TableResult.ok("修改该选手基本信息成功！");
        } catch (Exception e) {
            byte[] result = Base64.decodeBase64(base64);
            proBasicInfo.setProImg(result);
            proBasicInfoService.updateById(proBasicInfo);
            return TableResult.ok("修改该选手基本信息成功！");
        }
    }

    @Auth(roles = {"ADMIN", "EXECUTIVE"})
    @PostMapping("/addProBasicInfo")//映射的地址与方法名没有关系
    public TableResult<ProBasicInfo> addProBasicInfo(ProBasicInfo proBasicInfo) {
        String base64 = new String(proBasicInfo.getProImg());
        try {
            base64 = base64.split(",")[1];//通过base64来转化图片,去掉图片头(data:image/jpg;base64,)
            //2,解码成字节数组
            byte[] result = Base64.decodeBase64(base64);
            proBasicInfo.setProImg(result);
            proBasicInfoService.save(proBasicInfo);
            return TableResult.ok("新增该选手基本信息成功！");
        } catch (Exception e) {
            byte[] result = Base64.decodeBase64(base64);
            proBasicInfo.setProImg(result);
            proBasicInfoService.save(proBasicInfo);
            return TableResult.ok("新增该选手基本信息成功！");
        }
    }

    @Auth(roles = {"ADMIN", "EXECUTIVE"})
    @PostMapping("/deleteProBasicInfo")//映射的地址与方法名没有关系
    public TableResult<ProBasicInfo> deleteProBasicInfo(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        proBasicInfoService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手基本信息成功！");
    }
}
