package com.hibernate.lab3_2.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.lab3_2.dao.HibernateDao;
import com.hibernate.lab3_2.entity.Account;
import com.hibernate.lab3_2.entity.User;
import com.hibernate.lab3_2.util.HibernateUtil;

public class HibernateDaoImpl implements HibernateDao {

    @Override
    public void addUser(User user) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.persist(user);
            tx.commit();
        }catch(Exception e) {
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void addAccount(Account account) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.save(account);
            tx.commit();
        }catch(Exception e) {
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        Account account=(Account)session.get(Account.class, id);
        tx.commit();
        return account;
    }

    @Override
    public User findUserById(Integer id) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        User user=(User)session.get(User.class, id);
        tx.commit();
        return user;
    }

}
