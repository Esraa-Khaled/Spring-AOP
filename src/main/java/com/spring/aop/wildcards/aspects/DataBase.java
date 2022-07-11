package com.spring.aop.wildcards.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
    /*
    @Before("execution(public * all*())")
    public void connectionDB() {
        System.out.println("Connected !");
    }
    */

    // if method has params give its qualified paths
    /*
    @Before("execution(public * all*(com.spring.aop.wildcards.model.User))")
    public void connectionDB() {
        System.out.println("Connected !");
    }
    */

    // .. means for any param type even if not exist
    /*
    @Before("execution(public * all*(com.spring.aop.wildcards.model.User, ..))")
    public void connectionDB() {
        System.out.println("Connected !");
    }
    */

    // make generic class holds execution expression than use it by name
    // for any method in any class inside package com.spring.dao which take any number of arguments
    @Pointcut("execution(public * com.spring.aop.wildcards.dao.*.*(..))")
    public void allClassesAdvice() {}
    /*
    @Before("allClassesAdvice()")
    public void connectionDB() {
        System.out.println("Connected !");
    }

    @Before("allClassesAdvice()")
    public void logIn() {
        System.out.println("Log In ... true");
    }
    */

    @Pointcut("execution(public * com.spring.aop.wildcards.dao.*.set*(..))")
    public void allSetters() {}

    @Pointcut("execution(public * com.spring.aop.wildcards.dao.*.get*(..))")
    public void allGetters() {}

    //for all functions inside package "com.spring.dao" except setters and getters
    @Pointcut("allClassesAdvice() && !(allGetters() || allSetters())")
    public void allExceptGettersAndSetters() {}

    @Before("allExceptGettersAndSetters()")
    public void connectionDB() {
        System.out.println("Connected !");
    }

    @Before("allExceptGettersAndSetters()")
    public void logIn() {
        System.out.println("Log In ... true");
    }
}
