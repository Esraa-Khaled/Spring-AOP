package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class DataBase {

    //this function will be executed each time before allPosts calling
    // modifiers is optional like public
    // public * >> means any return type

    /*
    @Before("execution(public * allPosts())")
    public void connectionDB() {
        System.out.println("Connected !");
    }
    */

    // for methods which start by word all...
    @Before("execution(public * all*())")
    public void connectionDB() {
        System.out.println("Connected !");
    }
}
