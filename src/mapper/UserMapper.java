package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.User;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where name=#{name} and pwd=#{pwd}")
    User selByPwd(User user);

    @Select("select * from user")
    List<User> selAll();
}
