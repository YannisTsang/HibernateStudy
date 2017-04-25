package com.hibernate.search.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.hibernate.search.dao.StudentDao;
import com.hibernate.search.entity.Student;
import com.hibernate.search.util.StudentUtil;

public class StudentDaoImpl implements StudentDao{

    @Override
    public List<Student> queryBySex(String sex) {
       Session session=StudentUtil.getSession();
       Transaction tx=session.beginTransaction();
       String hql="from Student where stuSex=?";
       Query query=session.createQuery(hql);
       query.setString(0,sex);
       List<Student> list=query.list();
       tx.commit();
        return list;
    }

    @Override
    public List<Student> queryByName(String name,String sex) {
        Session session=StudentUtil.getSession();
        Transaction tx=session.beginTransaction();
        Criteria criteria=session.createCriteria(Student.class);
        criteria.add(Restrictions.like("stuName",name));
        criteria.add(Restrictions.eq("stuSex",sex));
        List<Student> list=criteria.list();
        return list;
    }

    

}
