package com.spring;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        //call configuration class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContainer.class);

        PostDao pd = context.getBean("postDaoImpl", PostDao.class);
        pd.allPosts();
        System.out.println(pd.allLikes());

        PostService ps = context.getBean("postServiceImpl", PostService.class);
        System.out.println(ps.allPosts());
        System.out.println(ps.allLikes());

    }
}
