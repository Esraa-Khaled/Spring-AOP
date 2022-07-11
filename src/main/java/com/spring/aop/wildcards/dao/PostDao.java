package com.spring.aop.wildcards.dao;

import com.spring.aop.wildcards.model.User;

public interface PostDao {
    public void allPosts(User user);

    public String allLikes(User user, int id);

    public void funDao();

    public void setId();

    public void getId();
}
