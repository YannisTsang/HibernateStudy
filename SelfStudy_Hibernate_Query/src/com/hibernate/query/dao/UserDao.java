package com.hibernate.query.dao;

import com.hibernate.query.entity.User;

public interface UserDao {
   public User findUserByUsername(String username);
   public void addUser(User user);
   public User findUserByUsernameAndPassword(String username,String password);
}
