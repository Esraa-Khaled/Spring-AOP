package com.spring.aop.after;

import com.spring.aop.after.model.AccessDataBase;
import com.spring.configuration.SpringContainer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MAinAOP {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContainer.class);
        AccessDataBase adb = context.getBean("accessDataBase", AccessDataBase.class);
        System.out.println(adb.getStudent());
    }
}
