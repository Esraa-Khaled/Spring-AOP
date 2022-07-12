package com.spring.aop.exceptions;


import com.spring.aop.exceptions.model.ShapeService;
import com.spring.configuration.SpringContainer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContainer.class);

        ShapeService shapeService = context.getBean("myShape", ShapeService.class);
        shapeService.getSquare().setName("SQ");
        System.out.println(shapeService.getSquare().getName());
    }

}
