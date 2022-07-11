package com.spring.aop.after.model;

import org.springframework.stereotype.Component;

@Component
public class AccessDataBase {

    public String getStudent() {
        //System.out.println("Student name is Esraa");
        return "Student name is Esraa";
    }
}
