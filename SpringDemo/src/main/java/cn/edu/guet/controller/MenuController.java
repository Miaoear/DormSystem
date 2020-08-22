package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.UserDto;
import cn.edu.guet.model.Menu;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IMenuService;
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
@RequestMapping("menu")  //user
public class MenuController {


    /*
    自动装配（自动注入）：UserController依赖IUserService，那么Spring会自动装配
     */
    @Autowired
    IMenuService menuService;

    /**
     * gson（慢）
     * fastjson（漏洞多，速度慢）
     * jackson
     * @param
     * @param
     * @return user的信息（json格式），我们的login方法上使用了@ResponseBody注解后，会自动返回json数据
     */
    @RequestMapping(value = "showAllMenu",method = {RequestMethod.POST}) //showMenu
    @ResponseBody
    public Result showAllMenu(){  // showMenu

        Gson gson = new Gson();
        List<Menu> list01 =menuService.getAllMenu();
        // System.out.println(gson.toJson(list));
        Result result01 = Result.succ(list01);
        System.out.println("11111111111111111111111111"+gson.toJson(list01));
        return Result.succ(result01.getData());
    }

    @RequestMapping(value = "getRoleMenu",method = {RequestMethod.POST})
    @ResponseBody
    public Result getRoleMenu(String userId) {
        List<Menu> list02=menuService.getRoleMenu(userId);
        Result result02 = Result.succ(list02);
        return Result.succ(result02.getData());
    }
}
/*
    public List<Menu> getAllMenu(){
        return menuService.getAllMenu();
    }

 */