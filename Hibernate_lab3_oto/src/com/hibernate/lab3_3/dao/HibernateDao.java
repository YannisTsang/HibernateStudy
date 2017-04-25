package com.hibernate.lab3_3.dao;

import com.hibernate.lab3_3.entity.Department;
import com.hibernate.lab3_3.entity.Manager;

public interface HibernateDao {
     public void addManager(Manager manager);
     public void addDepartment(Department dept);
     public Manager FindManagerById(Integer id);
     public Department FindDeptById(Integer id);
}
