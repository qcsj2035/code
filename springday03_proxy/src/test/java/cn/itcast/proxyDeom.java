package cn.itcast;

import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyDeom {
    //jdk代理
    @Test
    public void test01(){

        final UserServiceImpl us =new UserServiceImpl();

        UserService userService = (UserService) Proxy.newProxyInstance(us.getClass().getClassLoader(), us.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj =null;
                System.out.println(method);

                try {
                    System.out.println("进站");
                    int i = 1/0;
                    obj = method.invoke(us, args);
                    System.out.println("检票");
                }catch (Exception e){
                    System.out.println("补票");
                }finally {
                    System.out.println("出站");
                }

                return obj;
            }
        });
        userService.test01();

    }
    //Cglib代理
    @Test
    public void test02(){
        final UserServiceImpl us = new UserServiceImpl();

       UserService userService = (UserService) Enhancer.create(us.getClass(), new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object obj =null;

                System.out.println(method);
                try {
                    System.out.println("买票");
                     obj = method.invoke(us, args);
                    System.out.println("检票");
                }catch (Exception e){
                    System.out.println("补票");
                }finally {
                    System.out.println("出站");
                }

                return obj;
            }
        });
       userService.test01();

    }
}
