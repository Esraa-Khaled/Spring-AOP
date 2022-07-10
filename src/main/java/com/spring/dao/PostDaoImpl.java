package com.spring.dao;

import com.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class PostDaoImpl implements PostDao{
    @Override
    public void allPosts(User user) {
        System.out.println("My Posts ..... PostDao");
    }

    @Override
    public String allLikes() {
        return "PostDao .... Likes";
    }
}