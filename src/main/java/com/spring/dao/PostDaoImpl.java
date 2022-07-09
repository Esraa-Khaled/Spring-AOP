package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostDaoImpl implements PostDao{
    @Override
    public void allPosts() {
        System.out.println("my Post");
    }
}