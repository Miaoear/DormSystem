package cn.edu.guet.service;

import cn.edu.guet.model.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> getAllMenu();
    List<Menu> getRoleMenu(String userId);
}
