package com.hibernate.query.test;

import com.hibernate.query.entity.User;
import com.hibernate.query.service.UserService;

public class Test {

    public static void main(String []args) {
        UserService userService=new UserService();
        /*
        //1.There is no data in database.
        User user1=new User();
        user1.setUsername("Daniel");
        user1.setPassword("1234");
        userService.regist(user1);
        
        
        //2.There is already some data in database.
        User user2=new User();
        user2.setUsername("Daniel");
        user2.setPassword("1234");
        userService.regist(user2);
        */
        
        //3.Login.
        User user3=userService.login("Yannis", "123");
        System.out.println(user3);
        
    }
}
