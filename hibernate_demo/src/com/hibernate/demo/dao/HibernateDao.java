package com.hibernate.demo.dao;

import com.hibernate.demo.domain.Person;

/**
 * Created by Administrator on 2017/4/11.
 */
public interface HibernateDao {
    public void addPerson(Person person);
    public void deletePerson(Person person);
    public void updatePerson(Person person);
    public Person getPersonById(Integer id);
}
