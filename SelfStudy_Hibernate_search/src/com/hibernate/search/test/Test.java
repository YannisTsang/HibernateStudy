package com.hibernate.search.test;

import java.util.List;

import com.hibernate.search.dao.StudentDao;
import com.hibernate.search.dao.impl.StudentDaoImpl;
import com.hibernate.search.entity.Student;

public class Test {
   public static void main(String []args) {
       StudentDao studentDao=new StudentDaoImpl();
       /*
       List<Student> list=studentDao.queryBySex("Ů");
       if(list!=null) {
       for(Student stu:list) {
           System.out.println("����:"+stu.getStuName()+", ѧ��ѧ��:"+stu.getStuNo());
       }
       }else if(list==null||"".equals(list)) {
           System.out.println("dick");
       }
       */
       List<Student> list1=studentDao.queryByName("Ya%","��");
       if(list1!=null) {
           for(Student stu:list1) {
               System.out.println("����:"+stu.getStuName()+", ѧ��ѧ��:"+stu.getStuNo()+", ѧ���Ա�:"+stu.getStuSex());
           }
       }
   }
}
