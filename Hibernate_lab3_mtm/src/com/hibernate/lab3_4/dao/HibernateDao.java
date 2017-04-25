package com.hibernate.lab3_4.dao;

import com.hibernate.lab3_4.entity.Order;
import com.hibernate.lab3_4.entity.Product;

public interface HibernateDao {
  public void addOrder(Order order);
  public void addProduct(Product product);
  public Order findOrderById(Integer id);
  public Product findProductById(Integer id);
}
