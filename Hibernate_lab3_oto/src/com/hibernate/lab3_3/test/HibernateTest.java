package com.hibernate.lab3_3.test;

import com.hibernate.lab3_3.dao.HibernateDao;
import com.hibernate.lab3_3.dao.impl.HibernateDaoImpl;
import com.hibernate.lab3_3.entity.Department;
import com.hibernate.lab3_3.entity.Manager;

public class HibernateTest {
    static HibernateDao dao=new HibernateDaoImpl();
    public static void main(String []args) {
        addManager_Department();
        loadManager();
    }
   
    private static void addManager_Department() {
        // TODO Auto-generated method stub
        Department dept=new Department();
        dept.setName("������");
        Manager manager=new Manager();
        manager.setNo("#0002");
        manager.setName("Ҷ���");
        manager.setDept(dept);
        dept.setManager(manager);
        dao.addDepartment(dept);
    }
    
    private static void loadManager() {
        // TODO Auto-generated method stub
        Manager manager=dao.FindManagerById(2);
        System.out.println("����:"+manager.getName());
        System.out.println("����:"+manager.getNo());
        System.out.println("���ڲ���:"+manager.getDept().getName());
    }
    
    
}
