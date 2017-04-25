package com.hibernate.lab3_2.dao;

import com.hibernate.lab3_2.entity.Account;
import com.hibernate.lab3_2.entity.User;

public interface HibernateDao {
    public void addUser(User user);
    public void addAccount(Account account);
    public Account findAccountById(Integer id);
    public User findUserById(Integer id);
}
