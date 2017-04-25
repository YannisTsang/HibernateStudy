package com.hibernate.lab3_2.entity;

import java.util.HashSet;
import java.util.Set;

public class User {

    private Integer id;
    private String name;
    private String password;
    private Set<Account> accounts=new HashSet<Account>();
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
    
}
