package com.spring.aop.order.model;

import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {

    public void getData() {
        System.out.println("I am Person");
    }
}
