package com.hibernate.search.dao;

import java.util.List;

import com.hibernate.search.entity.Student;

public interface StudentDao {
    public List<Student> queryBySex(String sex);
    public List<Student> queryByName(String name,String sex);
}
