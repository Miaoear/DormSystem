package cn.edu.guet;

import cn.edu.guet.common.Result;
import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IMenuService;
import cn.edu.guet.service.IUserService;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class SpringTest {
    @Autowired
    IUserService userService;
    @Autowired
    IMenuService menuService;

    @Test
    public void testLogin(){
        User user=userService.login("","");
        Assert.assertNotEquals(null,user);
    }

    @Test
    public void testGetAllMenu(){
        List<Menu> menuList=menuService.getAllMenu();
        for (Menu menu:menuList){
            System.out.println(menu.getName());
        }

    }
}