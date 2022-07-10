package com.spring;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;
import com.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        //call configuration class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContainer.class);

        PostDao pd = context.getBean("postDaoImpl", PostDao.class);
        User u = new User();
        int id = 0;

        pd.allPosts(u);
        System.out.println(pd.allLikes(u, id));
        pd.funDao();
        pd.setId();
        pd.getId();
        System.out.println("/*************************/");

        PostService ps = context.getBean("postServiceImpl", PostService.class);

        System.out.println(ps.allPosts(u, id));
        System.out.println(ps.allLikes(u));
        ps.startService();
        ps.setName();
        ps.getName();
    }
}
