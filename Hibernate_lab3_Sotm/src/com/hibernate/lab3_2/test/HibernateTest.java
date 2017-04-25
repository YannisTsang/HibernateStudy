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
        user.setName("梁慧骑");
        user.setPassword("1234321");
        
        //设置一对多关联关系
        user.getAccounts().add(account1);
        user.getAccounts().add(account2);
        //设置多对一关联关系
        account1.setUser(user);
        account2.setUser(user);
        
        dao.addUser(user);
        
    }
    
    
    
    public static void loadUser() {
        User user=dao.findUserById(1);
        Set<Account> accounts=user.getAccounts();
        System.out.println("账户所有人姓名: "+user.getName()+", 其拥有账户如下: ");
        System.out.println("==========================");
        for(Account account:accounts) {
            System.out.println("账户编号: "+account.getId());
            System.out.println("银行账户: "+account.getActNo());
            System.out.println("账户余额: "+account.getBal());
            System.out.println("======================");
        }
    }
}
