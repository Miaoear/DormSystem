package cn.edu.guet.service;

import cn.edu.guet.model.User;

import java.util.List;

public interface IUserService {

    User login(String userId, String password);

    List<User> showStu(String rolename);

    void updateStu(User user);

    void saveStu(User user) throws Exception;
    void deleteStu(String userId) throws Exception;
}
