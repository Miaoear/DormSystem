package cn.edu.guet.mapper;

import cn.edu.guet.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User login(@Param("username") String username, @Param("password") String password);

    List<User> showStu(String rolename);

    void updateStu(User user);
}