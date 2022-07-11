package com.spring.aop.wildcards;

import com.spring.configuration.SpringContainer;
import com.spring.aop.wildcards.dao.PostDao;
import com.spring.aop.wildcards.dao.PostService;
import com.spring.aop.wildcards.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP {
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
