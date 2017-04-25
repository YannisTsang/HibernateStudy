package com.hibernate.lab3_1.test;

import com.hibernate.lab3_1.dao.HibernateDao;
import com.hibernate.lab3_1.dao.impl.HibernateDaoImpl;
import com.hibernate.lab3_1.entity.Account;
import com.hibernate.lab3_1.entity.User;

public class HibernateTest {
  static HibernateDao dao=new HibernateDaoImpl();
  public static void main(String []args) {
      /*addUser();
      addAccount();*/
      loadAccount();
  }
  public static void addUser() {
      User user=new User();
      user.setName("曾衍钊");
      user.setPassword("123445");
      dao.addUser(user);
  }
  
  public static void addAccount() {
      User user=dao.findUserById(1);
      Account account1=new Account();
      account1.setActNo("123");
      account1.setBal(2150);
      account1.setUser(user);
      dao.addAccount(account1);
      Account account2=new Account();
      account2.setActNo("456");
      account2.setBal(999);
      
      //设置单向多对一关联关系
      account2.setUser(user);
      dao.addAccount(account2);
  }
  public static void loadAccount() {
      Account account=dao.findAccountById(1);
      System.out.println("银行账号: "+account.getActNo());
      System.out.println("账户所有人姓名: "+account.getUser().getName());
      System.out.println("账户余额: "+account.getBal());
  }
}
