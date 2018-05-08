package com.ssm.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect//声明为切面类
@Component//声明是一个JavaBean
public class SpringAop {
    //（方法执行前先执行的方法）execution是起点的表达式
    @Before("logdebug()")
    public void  dobefore(){
        System.out.println("前置方法");
    }

    @Pointcut("execution (* com.ssm.services.impl.AopServiceImpl.*(..))")
    private void  logdebug(){
    }
    //(方法执行后再执行的方法) 不管正常执行或异常都执行。
    @After("logdebug()")
    public void doafter(){
        System.out.println("后置方法");
    }

    //方法正确执行后的方法，参数（切点表达式，返回值变量）
    @AfterReturning(pointcut = "execution (* *.logdebug())",returning = "result")
    public void returning(JoinPoint join,String result ){
        System.out.println("方法名为："+join);
        System.out.println("结果为："+result);
    }
    //（方法抛出异常时执行的方法）参数（切点表达式，抛出的异常变量）
    @AfterThrowing(pointcut = "execution (* *.logdebug())",throwing = "et")
    public void throwing(JoinPoint joinPoint,Exception et){
        System.out.println("方法名为："+joinPoint);
        System.out.println("异常为："+et);
    }
}
