package cn.itcast.web;

import cn.itcast.config.springConfig;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {springConfig.class})
public class servlet {

    @Autowired
    private UserService userService;

   @Test
    public void test01(){
       List<User> all = userService.findAll();
       System.out.println(all);
   }
}
