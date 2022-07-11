package com.spring.aop.order;

import com.spring.configuration.SpringContainer;
import com.spring.aop.order.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContainer.class);

        Person p = context.getBean("myPerson", Person.class);
        p.getData();
    }
}
