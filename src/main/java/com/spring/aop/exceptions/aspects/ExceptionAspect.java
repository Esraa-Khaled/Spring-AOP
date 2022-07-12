package com.spring.aop.exceptions.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

    // within for classes or packages
    @Pointcut("within(com.spring.aop.exceptions.model.Star)")
    public void allCircleMethods() {}

    // executed when exception happens
    @AfterThrowing("args(name)")
    public void Exceptions(String name) {
        System.out.println("An exception has been thrown");
    }

}
