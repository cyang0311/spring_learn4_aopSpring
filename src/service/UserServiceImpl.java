package service;

import mapper.UserMapper;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pojo.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Value("${User.name}")
    private String name;

    public UserMapper getUserMapper() {
        return userMapper;
    }


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(User user) {
        System.out.println(name);
        return userMapper.selByPwd(user);
    }

    @Override
    public List<User> list() {
        return userMapper.selAll();
    }

}
