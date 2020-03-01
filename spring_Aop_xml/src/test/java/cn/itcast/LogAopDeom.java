package cn.itcast;

import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogAopDeom {


    @Test
    public void test01(){
    ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) ac.getBean("userService", UserService.class);
        userService.test2();
    }

}
