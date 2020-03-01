package cn.itcast.anno;

import org.springframework.stereotype.Component;

//目标对象
@Component("userServiceImpl")
public class UserServiceImpl implements UserService {
    public void rent() {
        System.out.println("房屋出租");
    }

    public void check(){
        System.out.println("审核");
    }
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
//        int i =1/0;
        System.out.println("test2");
    }
    public void test3(){
        System.out.println("test3");
    }
}
