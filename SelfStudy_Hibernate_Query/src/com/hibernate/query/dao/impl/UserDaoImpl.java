package com.hibernate.query.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import org.hibernate.query.Query;

import com.hibernate.query.dao.UserDao;
import com.hibernate.query.entity.User;
import com.hibernate.query.util.UserUtil;

public class UserDaoImpl implements UserDao{

    @Override
    public User findUserByUsername(String username) {
        Session session=UserUtil.getSession();
        Transaction tx=session.beginTransaction();
        String hql="from User u where u.username=?";
        Query query=session.createQuery(hql);
        query.setString(0, username);
        List<User> list=query.list();
        tx.commit();
        if(list!=null&&list.size()>0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        Session session=UserUtil.getSession();
        Transaction tx=session.beginTransaction();
        session.save(user);
        tx.commit();
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        Session session=UserUtil.getSession();
        Transaction tx=session.beginTransaction();
        String hql="from User u where u.username=? and u.password=?";
        Query query=session.createQuery(hql);
        query.setString(0,username);
        query.setString(1,password);
        List<User> list=query.list();
        tx.commit();
        if(list!=null && list.size()>0) {
            return list.get(0);
        }
        return null;
    }

    
}
