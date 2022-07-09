package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class DataBase {

    //this function will be executed each time before allPosts calling
    // modifiers is optional like public
    @Before("execution(public void com.spring.dao.PostDao.allPosts())")
    public void connectionDB() {
        System.out.println("Connected !");
    }
}
