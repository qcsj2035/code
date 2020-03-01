package cn.itcast.web;

import cn.itcast.domian.User;
import cn.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Servlet {

    @Test
    public void seach(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        List<User> all = userService.findAll();
        System.out.println(all);
    }
}
