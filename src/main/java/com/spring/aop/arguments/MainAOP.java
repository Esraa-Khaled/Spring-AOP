package com.spring.aop.arguments;

import com.spring.aop.arguments.model.Circle;
import com.spring.aop.arguments.model.ShapeService;
import com.spring.configuration.SpringContainer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SpringContainer.class);

        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("CR");
        System.out.println(shapeService.getCircle().getName());
    }

}
