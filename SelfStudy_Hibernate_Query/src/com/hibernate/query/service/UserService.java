package com.hibernate.query.service;

import com.hibernate.query.dao.UserDao;
import com.hibernate.query.dao.impl.UserDaoImpl;
import com.hibernate.query.entity.User;

public class UserService {
    private UserDao userDao=new UserDaoImpl();
    //regist function
    public void regist(User user) {
        String username=user.getUsername();
        if(username==null||"".equals(username)) {
            System.out.println("�û�������Ϊ�գ�");
            throw new RuntimeException("�û�������Ϊ�գ�");
        }
        
        User db_user=userDao.findUserByUsername(username);
        if(db_user!=null) {
            System.out.println("�û����Ѵ��ڣ�");
            throw new RuntimeException("�û����Ѵ���!");
        }
    
        userDao.addUser(user);
        System.out.println("ע��ɹ���");
    }
    
    //Login function
    public User login(String username,String password) {
        if(username==null||"".equals(username)) {
            System.out.println("�û�������Ϊ�գ�");
            throw new RuntimeException("�û�������Ϊ�գ�");
        }
        User user =userDao.findUserByUsernameAndPassword(username, password);
        if(user == null) {
            System.out.println("�û������������");
            throw new RuntimeException("�û������������");
        }
        System.out.println("��½�ɹ���");
        return user;
    }
    
    
}
