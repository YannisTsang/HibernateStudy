package com.hibernate.lab3_2.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static ServiceRegistry sr;
    private static SessionFactory sf;
    private HibernateUtil() {}
    static {
        sr=new StandardServiceRegistryBuilder().configure().build();
        sf=new MetadataSources(sr).buildMetadata().buildSessionFactory();
    }
    public static Session getSession() {
        Session session=sf.openSession();
        return session;
    }
}
