package com.hibernate.lab3_1.entity;

public class Account {

    private Integer id;
    private String actNo;
    private double bal;
    private User user;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getActNo() {
        return actNo;
    }
    public void setActNo(String actNo) {
        this.actNo = actNo;
    }
    public double getBal() {
        return bal;
    }
    public void setBal(double bal) {
        this.bal = bal;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
    
}
