package com.hibernate.lab3_3.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.lab3_3.dao.HibernateDao;
import com.hibernate.lab3_3.entity.Department;
import com.hibernate.lab3_3.entity.Manager;
import com.hibernate.lab3_3.util.HibernateUtil;

public class HibernateDaoImpl implements HibernateDao{

    @Override
    public void addManager(Manager manager) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.persist(manager);
            tx.commit();
        }catch(Exception e) {
            if(null!=tx) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void addDepartment(Department dept) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.persist(dept);
            tx.commit();
        }catch(Exception e) {
            if(null!=tx) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Manager FindManagerById(Integer id) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        Manager manager=(Manager)session.get(Manager.class, id);
        tx.commit();
        return manager;
    }

    @Override
    public Department FindDeptById(Integer id) {
        // TODO Auto-generated method stub
        Session session=HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        Department dept=(Department)session.get(Department.class, id);
        return dept;
    }

}
