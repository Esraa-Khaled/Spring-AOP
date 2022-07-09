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
        pd.allPosts();

        PostService ps = context.getBean("postServiceImpl", PostService.class);
        ps.allPosts();
    }
}
