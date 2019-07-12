package advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;
import pojo.User;

import java.lang.reflect.Method;
import java.util.Date;


@Component("before")
public class before implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        User user = (User) objects[0];
        Logger logger = Logger.getLogger(before.class);
        logger.info(user.getName()+"在"+new Date().toLocaleString()+"进行登录");
    }
}
