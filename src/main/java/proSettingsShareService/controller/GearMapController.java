package proSettingsShareService.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proSettingsShareService.entity.GearMap;
import proSettingsShareService.service.IGearMapService;
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
 * @since 2023-09-30
 */
@RestController
@RequestMapping("/gearMap")
@CrossOrigin//允许跨域请求
public class GearMapController {
    @Autowired//自动从Spring容器中获取对象给变量赋值
    private IGearMapService iGearMapService;

    @GetMapping("/getGearMapList")
    public TableResult<GearMap> getGearMapList(Integer limit, Integer page, HttpServletRequest request) {
        if (limit == null && page == null) {
            List<GearMap> gearMapList = iGearMapService.list();
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", gearMapList.size(), gearMapList);
        } else {
            Page<GearMap> gearMapPage = new Page<>(page, limit);
            Page<GearMap> page1 = iGearMapService.page(gearMapPage); // 调用service层的page方法,返回分页
            // getTotal()方法返回表里的总记录数,getRecords()方法返回当前页的数据列表
            return TableResult.ok("查询成功", page1.getTotal(), page1.getRecords());
        }
    }

    @Auth(roles = {"ADMIN", "EXECUTIVE"})
    @PostMapping("/updateGearMapInfo")
    public TableResult<GearMap> updateGearMapInfo(GearMap gearMap) {
        String base64 = new String(gearMap.getGearImg());
        try {
            base64 = base64.split(",")[1];//通过base64来转化图片,去掉图片头(data:image/jpg;base64,)
            //2,解码成字节数组
            byte[] result = Base64.decodeBase64(base64);
            gearMap.setGearImg(result);
            iGearMapService.updateById(gearMap);
            return TableResult.ok("修改该外设映射信息成功！");
        } catch (Exception e) {
            byte[] result = Base64.decodeBase64(base64);
            gearMap.setGearImg(result);
            iGearMapService.updateById(gearMap);
            return TableResult.ok("修改该外设映射信息成功！");
        }
    }

    @Auth(roles = {"ADMIN", "EXECUTIVE"})
    @PostMapping("/addGearMapInfo")//映射的地址与方法名没有关系
    public TableResult<GearMap> addGearMapInfo(GearMap gearMap) {
        String base64 = new String(gearMap.getGearImg());
            try {
                base64 = base64.split(",")[1];//通过base64来转化图片,去掉图片头(data:image/jpg;base64,)
                //2,解码成字节数组
                byte[] result = Base64.decodeBase64(base64);
                gearMap.setGearImg(result);
                iGearMapService.save(gearMap);
                return TableResult.ok("新增该外设映射信息成功！");
            } catch (Exception e) {
                byte[] result = Base64.decodeBase64(base64);
                gearMap.setGearImg(result);
                iGearMapService.save(gearMap);
                return TableResult.ok("新增该外设映射信息成功！");
            }
        }
    @Auth(roles = {"ADMIN", "EXECUTIVE"})
    @PostMapping("/deleteGearMapInfo")//映射的地址与方法名没有关系
    public TableResult<GearMap> deleteGearMapInfo(Integer[] ids) {//参数名要和前端的ajax方法中的data参数里面的属性名字一致
        iGearMapService.removeByIds(Arrays.asList(ids));//asList用于将数组转化为List
        return TableResult.ok("删除该选手基本信息成功！");
    }
}
