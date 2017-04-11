package com.hibernate.demo.Test;

import com.hibernate.demo.dao.HibernateDao;
import com.hibernate.demo.dao.impl.HibernateDaoImpl;
import com.hibernate.demo.domain.NewsTableEntity;
import com.hibernate.demo.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Administrator on 2017/4/11.
 */
public class hibernateTest {

    public static void main(String[] args) {
        HibernateDao hibernateDao=new HibernateDaoImpl();
        //插入两条数据
        /*
        Person person1=new Person();
        person1.setSno("#0001");
        person1.setName("曾衍钊");
        person1.setSex('男');
        person1.setAge(21);

        Person person2=new Person();
        person2.setSno("#0002");
        person2.setName("黄秋生");
        person2.setSex('男');
        person2.setAge(55);

        hibernateDao.addPerson(person1);
        hibernateDao.addPerson(person2);

        Person person4=new Person();
        person4.setSno("#0003");
        person4.setName("Daniel");
        person4.setSex('男');
        person4.setAge(20);

        hibernateDao.addPerson(person4);
        */

        //查询主键为2的实体，控制台输出
        /*
        Person p2=new Person();
        p2=hibernateDao.getPersonById(2);
        System.out.println("主键为2的实体为："+p2.getId()+". "+p2.getName()+": "+"年龄为:"+p2.getAge());

        //更改主键为2的实体，控制台输出
        p2.setAge(62);
        hibernateDao.updatePerson(p2);
        System.out.println("主键2实体更改后情况为:"+p2.getId()+". "+p2.getName()+": "+"年龄为:"+p2.getAge());
        */

        //删除主键为3的实体
        Person p3=hibernateDao.getPersonById(3);
        hibernateDao.deletePerson(p3);
        Person person3=new Person();
        person3=hibernateDao.getPersonById(3);
        if(null==person3){
            System.out.println("对不起，主键为3的实体已被删除！");
        }

    }
}
