package com.hibernate.lab3_4.test;

import java.util.Set;

import com.hibernate.lab3_4.dao.HibernateDao;
import com.hibernate.lab3_4.dao.impl.HibernateDaoImpl;
import com.hibernate.lab3_4.entity.Order;
import com.hibernate.lab3_4.entity.Product;

public class HibernateTest {
   static HibernateDao dao=new HibernateDaoImpl();
   public static void main(String []args) {
       //addOrder_Product();
       loadOrder();
   }
public static void loadOrder() {
    // TODO Auto-generated method stub
    Order order=dao.findOrderById(2);
    System.out.println("1号订单信息如下:");
    System.out.println("==================");
    System.out.println("客户姓名:"+order.getRealname());
    System.out.println("送货地址:"+order.getAddress());
    System.out.println("订单总价:"+order.getTotal());
    System.out.println("该客户订购了一下几种产品:");
    Set<Product> products=order.getProducts();
    for(Product product:products) {
        System.out.println(product.getId()+". "+product.getName()+", 单价:"+product.getPrice());
    }
}
public static void addOrder_Product() {
    // TODO Auto-generated method stub
    Order order=new Order();
    order.setAddress("万科金色成品");
    order.setPhone("18588697809");
    order.setPostcode("511400");
    order.setRealname("曾衍钊");
    Product product1=new Product();
    product1.setName("Yeezy boost 750 grey");
    product1.setDescription("无需要讲甘多！");
    product1.setPrice(10999);
    Product product2=new Product();
    product2.setName("Adidas UltraBoost 3.0");
    product2.setDescription("tripple black.");
    product2.setPrice(1499);
    double total=product1.getPrice()+product2.getPrice();
    order.setTotal(total);
    
    //设置多对多关系
    order.getProducts().add(product1);
    order.getProducts().add(product2);
    product1.getOrders().add(order);
    product2.getOrders().add(order);
    
    dao.addOrder(order);
}
}
