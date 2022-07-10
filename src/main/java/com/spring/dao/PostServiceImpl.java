package com.spring.dao;

import com.spring.model.User;
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
}
