package com.hibernate.lab3_2.test;

import java.util.Set;

import com.hibernate.lab3_2.dao.HibernateDao;
import com.hibernate.lab3_2.dao.impl.HibernateDaoImpl;
import com.hibernate.lab3_2.entity.Account;
import com.hibernate.lab3_2.entity.User;

public class HibernateTest {
    static HibernateDao dao=new HibernateDaoImpl();
    public static void main(String []args) {
        //addUser_Account();
        loadUser();
    }
    
    
    public static void addUser_Account() {
        Account account1=new Account();
        account1.setActNo("#001");
        account1.setBal(1600);
        Account account2=new Account();
        account2.setActNo("#002");
        account2.setBal(888);
        User user=new User();
        user.setName("������");
        user.setPassword("1234321");
        
        //����һ�Զ������ϵ
        user.getAccounts().add(account1);
        user.getAccounts().add(account2);
        //���ö��һ������ϵ
        account1.setUser(user);
        account2.setUser(user);
        
        dao.addUser(user);
        
    }
    
    
    
    public static void loadUser() {
        User user=dao.findUserById(1);
        Set<Account> accounts=user.getAccounts();
        System.out.println("�˻�����������: "+user.getName()+", ��ӵ���˻�����: ");
        System.out.println("==========================");
        for(Account account:accounts) {
            System.out.println("�˻����: "+account.getId());
            System.out.println("�����˻�: "+account.getActNo());
            System.out.println("�˻����: "+account.getBal());
            System.out.println("======================");
        }
    }
}
