package com.spring.dao;

import com.spring.model.User;

public interface PostDao {
    public void allPosts(User user);

    public String allLikes();
}
