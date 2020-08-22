package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.UserDto;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/*
Controller把普通的pojo标记为一个控制器（就能接收请求、返回数据）
 */
@Controller
@RequestMapping("user")
public class UserController {


    /*
    自动装配（自动注入）：UserController依赖IUserService，那么Spring会自动装配
     */
    @Autowired

    IUserService userService;

    /**
     * gson（慢）
     * fastjson（漏洞多，速度慢）
     * jackson
     * @param
     * @param
     * @return user的信息（json格式），我们的login方法上使用了@ResponseBody注解后，会自动返回json数据
     */
    @RequestMapping(value = "login",method = {RequestMethod.POST})
    @ResponseBody
    public Result login(String username,String password){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        User user=userService.login(username,password);
        if(user!=null){
            return Result.succ(user);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "showStu",method = {RequestMethod.POST})
    @ResponseBody
    /*public Result showStu(String rolename) {
        User user01 = userService.showStu("学生");
        return Result.succ(user01);
    }*/
    public Result showStu(String rolename){
        Gson gson=new Gson();
        System.out.println(gson.toJson(userService.showStu("学生")) );
        return Result.succ(userService.showStu("学生"));
    }

    @RequestMapping(value = "updateStu",method = {RequestMethod.POST})
    @ResponseBody
    public Result updateStu(@RequestBody User user){
        userService.updateStu(user);
        return Result.succ("修改成功");
    }
}