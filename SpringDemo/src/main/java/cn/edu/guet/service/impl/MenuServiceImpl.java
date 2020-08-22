package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuServiceImpl implements IMenuService {

    @Autowired  //Spring会自动注入menumapper
    MenuMapper menuMapper;
    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenu();
    }

    @Override
    public List<Menu> getRoleMenu(String userId) {
        return menuMapper.getRoleMenu(userId);
    }
}
