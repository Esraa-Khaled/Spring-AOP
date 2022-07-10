package com.spring.dao;

import com.spring.model.User;

public interface PostService {
    public String allPosts(User user, int id);

    public String allLikes(User user);

    public void startService();

    public void setName();

    public void getName();
}
