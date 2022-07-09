package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements  PostService{

    @Override
    public String  allPosts() {
        return "My Posts ..... PostService";
    }
}
