package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.SsDorm;
import cn.edu.guet.service.IDormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Dorm")
public class DormCtrotroller {

    @Autowired
    IDormService dormService;


    @RequestMapping(value = "showDorm",method = {RequestMethod.POST})
    public Result showDrom()throws Exception{

        List<SsDorm> dorm = dormService.selectDorm();
        Result result = Result.succ(dorm);

        return result;
    }
    @RequestMapping(value = "updateDorm",method = {RequestMethod.POST})
    public Result updateDrom(SsDorm ssDorm)throws Exception{
         dormService.updateDorm(ssDorm);
        System.out.println(ssDorm);
        return Result.succ("修改成功");

    }
    @RequestMapping(value = "deleteDorm",method = {RequestMethod.POST})
    public Result deleteDorm(String dorNo){
        try {
            dormService.deleteDorm(dorNo);
            System.out.println(dorNo);
            return Result.succ("删除宿舍信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("删除宿舍信息失败，请联系管理员解决");
        }
    }
    @RequestMapping(value = "saveDorm",method = {RequestMethod.POST})
    public Result saveDorm(SsDorm dorm){
        try {
            dormService.saveDorm(dorm);
            System.out.println("添加宿舍信息成功");
            return Result.succ("添加宿舍信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("添加宿舍信息失败，请联系管理员解决");
        }

    }
}
