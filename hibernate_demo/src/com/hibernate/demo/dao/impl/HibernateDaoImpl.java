package com.hibernate.demo.dao.impl;

import com.hibernate.demo.dao.HibernateDao;
import com.hibernate.demo.domain.Person;
import com.hibernate.demo.util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2017/4/11.
 */
public class HibernateDaoImpl implements HibernateDao {
    @Override
    public void addPerson(Person person) {
        Session session= hibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try{
            session.save(person);
            tx.commit();
        }catch(Exception e){
            if(null!=tx)
                tx.rollback();
                e.printStackTrace();
        }
    }

    @Override
    public void deletePerson(Person person) {
        Session session=hibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.delete(person);
            tx.commit();
        }catch (Exception e){
            if(null!=tx)
                tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void updatePerson(Person person) {
        Session session=hibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try{
            session.update(person);
            tx.commit();
        }catch (Exception e){
            if(null!=tx)
                tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Person getPersonById(Integer id) {
        Session session=hibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        Person person=(Person)session.get(Person.class,id);
        tx.commit();
        return person;
    }
}
