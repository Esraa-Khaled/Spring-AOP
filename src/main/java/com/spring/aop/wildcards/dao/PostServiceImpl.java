package com.spring.aop.wildcards.dao;

import com.spring.aop.wildcards.model.User;
import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements  PostService{

    @Override
    public String  allPosts(User user, int id) {
        return "My Posts ..... PostService";
    }

    @Override
    public String allLikes(User user) {
        return "PostService ..... Likes";
    }

    @Override
    public void startService() {
        System.out.println("Start Service");
    }

    @Override
    public void setName() {
        System.out.println("This is set Name");
    }

    @Override
    public void getName() {
        System.out.println("This is get Name");
    }
}
