package com.spring.aop.arguments.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    @Pointcut("execution(* get*())")
    public void allGetters() {}

    @Pointcut("within(com.spring.aop.arguments.model.Circle)")
    public void allCircleMethods() {}

    // JoinPoint has info about the actual method which trigger this advice
    @Before("allCircleMethods()")
    public void LoginAdvice(JoinPoint joinPoint) {
        System.out.println("Login Advice Run... Method called is: " + joinPoint.toString());
    }

    // for method which takes String argument
    @Before("args(String)")
    public void arguments() {
        System.out.println("method takes arguments");
    }

    // pass arguments to advice method
    @Before("args(name)")
    public void arguments(JoinPoint joinPoint, String name) {
        System.out.println("method " + joinPoint.toString()  + " is called with arguments : " + name);
    }
}
