package cn.itcast.web;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop1 {//提供增强方法的类，我们称为切面类，由此类创建出来的对象称之为切面对象
    public void before(){
        System.out.println("before...");
    }
    public void afterRunning(){
        System.out.println("afterRunning...");
    }
    public void throwing(){
        System.out.println("throwing...");
    }
    public void after(){
        System.out.println("after...");
    }
    public void round(ProceedingJoinPoint point){
        System.out.println("环绕增强...");

        Object obj = null;
        try {
            before();
            obj = point.proceed();
            afterRunning();
        }catch (Throwable throwable) {
            throwing();
        } finally {
            after();
        }
    }
}
