package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String userId, String password) {
        return userMapper.login(userId,password);
    }

    @Override
    @Transactional
    public List<User> showStu(String rolename) {
        return userMapper.showStu(rolename);
    }

    @Override
    @Transactional
    //事务提升到业务层
    public void updateStu(User user) {
        userMapper.updateStu(user);
    }

}