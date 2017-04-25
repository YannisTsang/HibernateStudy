package com.hibernate.search.test;

import java.util.List;

import com.hibernate.search.dao.StudentDao;
import com.hibernate.search.dao.impl.StudentDaoImpl;
import com.hibernate.search.entity.Student;

public class Test {
   public static void main(String []args) {
       StudentDao studentDao=new StudentDaoImpl();
       /*
       List<Student> list=studentDao.queryBySex("女");
       if(list!=null) {
       for(Student stu:list) {
           System.out.println("姓名:"+stu.getStuName()+", 学生学号:"+stu.getStuNo());
       }
       }else if(list==null||"".equals(list)) {
           System.out.println("dick");
       }
       */
       List<Student> list1=studentDao.queryByName("Ya%","男");
       if(list1!=null) {
           for(Student stu:list1) {
               System.out.println("姓名:"+stu.getStuName()+", 学生学号:"+stu.getStuNo()+", 学生性别:"+stu.getStuSex());
           }
       }
   }
}
