package cn.edu.guet.mapper;

import cn.edu.guet.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User login(@Param("userId") String userId, @Param("password") String password);

    List<User> showStu(String rolename);

    void updateStu(User user);
}