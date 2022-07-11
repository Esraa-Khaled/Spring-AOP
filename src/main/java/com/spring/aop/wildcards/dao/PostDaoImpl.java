package com.spring.aop.wildcards.dao;

import com.spring.aop.wildcards.model.User;
import org.springframework.stereotype.Component;

@Component
public class PostDaoImpl implements PostDao{
    @Override
    public void allPosts(User user) {
        System.out.println("My Posts ..... PostDao");
    }

    @Override
    public String allLikes(User user, int id) {
        return "PostDao .... Likes";
    }

    @Override
    public void funDao() {
        System.out.println("Fun Dao");
    }

    @Override
    public void setId() {
        System.out.println("This is set Id");
    }

    @Override
    public void getId() {
        System.out.println("This is get Id");
    }
}