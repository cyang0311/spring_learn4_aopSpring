package advice;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;
import pojo.User;

import java.lang.reflect.Method;


@Component("after")
public class after implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        Logger logger = Logger.getLogger(after.class);
        User user = (User) objects[0];
        if (o!=null){
            logger.info(user.getName()+"登陆成功");
        }else {
            logger.info(user.getName()+"登陆失败");
        }
    }
}
