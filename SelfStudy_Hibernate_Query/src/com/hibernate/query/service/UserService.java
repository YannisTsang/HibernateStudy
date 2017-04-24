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
            System.out.println("用户名不能为空！");
            throw new RuntimeException("用户名不能为空！");
        }
        
        User db_user=userDao.findUserByUsername(username);
        if(db_user!=null) {
            System.out.println("用户名已存在！");
            throw new RuntimeException("用户名已存在!");
        }
    
        userDao.addUser(user);
        System.out.println("注册成功！");
    }
    
    //Login function
    public User login(String username,String password) {
        if(username==null||"".equals(username)) {
            System.out.println("用户名不能为空！");
            throw new RuntimeException("用户名不能为空！");
        }
        User user =userDao.findUserByUsernameAndPassword(username, password);
        if(user == null) {
            System.out.println("用户名或密码错误！");
            throw new RuntimeException("用户名或密码错误");
        }
        System.out.println("登陆成功！");
        return user;
    }
    
    
}
