package com.hibernate.test.dao;

import com.hibernate.test.entity.Order;
import com.hibernate.test.entity.Product;

public interface HibernateDao {
    public void addOrder(Order order);
    public void addProduct(Product product);
    public Order findOrderById(Integer id);
    public Product findProductById(Integer id);
  }
