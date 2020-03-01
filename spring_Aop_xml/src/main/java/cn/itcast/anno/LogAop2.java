package cn.itcast.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//@SuppressWarnings("all")
@Component("logAop2")
@Aspect//标注当前就是一个切面类
public class LogAop2 {//提供增强方法的类，我们称为切面类，由此类创建出来的对象称之为切面对象
//    @Before(value = "execution(* cn.itcast.anno.*.*(..))")
    public void before(){
        System.out.println("before...");
    }
    public void afterRunning(){
        System.out.println("afterRunning...");
    }
    public void throwing(){
        System.out.println("throwing...");
    }
    @After("pointput()")
    public void after(){
        System.out.println("after...");
    }


    @Around("LogAop2.pointput()")
    public void round(ProceedingJoinPoint point){
//        System.out.println("环绕增强...");

        Object obj = null;
        try {
            before();
            obj = point.proceed();
            afterRunning();
        }catch (Throwable throwable) {
//            throwing();
        } finally {
//            after();
        }
    }
    //定义切点表达式
    @Pointcut(value = "execution(* cn.itcast.anno.*.*(..))")
    public void pointput(){

    }
}
