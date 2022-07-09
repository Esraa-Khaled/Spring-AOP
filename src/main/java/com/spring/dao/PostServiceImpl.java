package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements  PostService{

    @Override
    public void allPosts() {
        System.out.println("My Posts ..... PostService");
    }
}
