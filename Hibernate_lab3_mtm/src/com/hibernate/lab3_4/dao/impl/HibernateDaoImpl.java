package com.hibernate.lab3_4.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.lab3_4.dao.HibernateDao;
import com.hibernate.lab3_4.entity.Order;
import com.hibernate.lab3_4.entity.Product;
import com.hibernate.lab3_4.util.HibernateUtil;

public class HibernateDaoImpl implements HibernateDao{

    @Override
    public void addOrder(Order order) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.persist(order);
            tx.commit();
        }catch(Exception e) {
            if(null!=tx) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void addProduct(Product product) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.persist(product);
            tx.commit();
        }catch(Exception e) {
            if(null!=tx) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Order findOrderById(Integer id) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        Order order=(Order)session.get(Order.class, id);
        tx.commit();
        return order;
    }

    @Override
    public Product findProductById(Integer id) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        Product product=(Product)session.get(Product.class, id);
        tx.commit();
        return product;
    }

}
