package com.example.annotationdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * FileName:TestAnnotationAspect
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 09:12:08
 */
@Aspect
@Component
public class TestAnnotationAspect {
    @Pointcut("@annotation(com.example.annotationdemo.MyTestAnnotation)")
    public void myAnnotationPointcut(){}
    @Before("myAnnotationPointcut()")
    public void before(JoinPoint joinPoint) throws Throwable
    {
        MethodSignature sign=(MethodSignature) joinPoint.getSignature();
        Method method=sign.getMethod();
        MyTestAnnotation annotation=method.getAnnotation(MyTestAnnotation.class);
        System.out.println("打印TestAnnotation 参数： "+annotation.value());
    }
}
