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
        dept.setName("行政部");
        Manager manager=new Manager();
        manager.setNo("#0002");
        manager.setName("叶浩瑜");
        manager.setDept(dept);
        dept.setManager(manager);
        dao.addDepartment(dept);
    }
    
    private static void loadManager() {
        // TODO Auto-generated method stub
        Manager manager=dao.FindManagerById(2);
        System.out.println("姓名:"+manager.getName());
        System.out.println("工号:"+manager.getNo());
        System.out.println("所在部门:"+manager.getDept().getName());
    }
    
    
}
