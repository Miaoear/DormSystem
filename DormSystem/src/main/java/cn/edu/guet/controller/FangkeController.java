package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Fangke;
import cn.edu.guet.service.IFangkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fangke")
public class FangkeController {
    @Autowired
    //自动装配（自动注入）：UserController依赖IUserService，那么Spring会自动装配
    //Fangke laifang(String LFName,String SFName,String Relation,String StartTime,String EndTime);
            IFangkeService fangkeService;
    @RequestMapping(value = "laifang",method = {RequestMethod.POST})
    public Result laifang(Fangke fangke){
        try{
            fangkeService.laifang(fangke);
            return Result.succ("添加成功");
        }catch(Exception e){
            e.printStackTrace();
            return Result.fail("添加失败");
        }
    }
    @RequestMapping(value = "chaxun",method = {RequestMethod.POST})
    public Result chaxun(){
       List list= fangkeService.chaxun();
       Result result= Result.succ(list);
       return result;
    }
    @RequestMapping(value = "bianji",method = {RequestMethod.POST})
    public Result bianji(Fangke fangke)throws Exception{
        try{
             fangkeService.bianji(fangke);
            return Result.succ("编辑成功");
        }catch(Exception e){
            e.printStackTrace();
            return Result.fail("编辑失败");
        }
    }
}