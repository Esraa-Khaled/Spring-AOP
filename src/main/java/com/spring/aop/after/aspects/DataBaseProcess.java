package com.spring.aop.after.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBaseProcess {

    @Before("execution(* getStudent(..))")
    public void beginTransaction() {
        System.out.println("Start transaction.....");
    }

    // @AfterReturning will be executed before @After
    // if method is void then only @After will be executed
    @AfterReturning("execution(* getStudent(..))")
    public void commitTransaction() {
        System.out.println("Commit Transaction.....");
    }

    @After("execution(* getStudent(..))")
    public void closeTransaction() {
        System.out.println("Close Transaction.....");
    }
}
