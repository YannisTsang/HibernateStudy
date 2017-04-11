package com.hibernate.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Administrator on 2017/4/11.
 */
public class hibernateUtil {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;
    //无参构造函数
    private hibernateUtil(){};
    //单例模型
    static{
        serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
        sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
    }

    public static Session getSession(){
        Session session=sessionFactory.getCurrentSession();
        return session;
    }
}
