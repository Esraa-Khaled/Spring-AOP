package com.spring.aop.exceptions.model;

import org.springframework.stereotype.Component;

@Component
public class Square {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Square's setter is called");
        throw new RuntimeException();
    }
}
