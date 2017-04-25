package com.hibernate.test.test;

import java.util.Set;

import com.hibernate.test.dao.HibernateDao;
import com.hibernate.test.dao.impl.HibernateDaoImpl;
import com.hibernate.test.entity.Order;
import com.hibernate.test.entity.OrderItem;
import com.hibernate.test.entity.Product;

public class HibernateTest {
    static HibernateDao dao=new HibernateDaoImpl();
    public static void main(String []args) {
        //addOrder();
        display();
    }
    
    
    public static void addOrder() {
        Order order1=new Order();
        Order order2=new Order();
        order1.setRealname("������");
        order1.setAddress("���");
        order1.setPhone("18588697809");
        order1.setPostcode("511400");
        
        order2.setRealname("Ҷ���");
        order2.setAddress("��ԣ��");
        order2.setPhone("13128264506");
        order2.setPostcode("511400");
        
        Product p1=dao.findProductById(1);
        Product p2=dao.findProductById(2);
        Product p3=dao.findProductById(3);
        
        OrderItem o1_1=new OrderItem(p1,order1,10,10000.00);
        OrderItem o1_2=new OrderItem(p2,order1,5,1299.00);
        
        OrderItem o2_1=new OrderItem(p1,order2,2,10500.00);
        OrderItem o2_2=new OrderItem(p3,order2,15,1499.00);
        
        double total1=10*10000+5*1299.00;
        double total2=2*10500+15*1499.00;
        order1.setTotal(total1);
        order2.setTotal(total2);
        
        order1.getOrderItems().add(o1_1);
        order1.getOrderItems().add(o1_2);
        
        order2.getOrderItems().add(o2_1);
        order2.getOrderItems().add(o2_2);
        
        dao.addOrder(order1);
        dao.addOrder(order2);
    }
    
    public static void display() {
        Order order=dao.findOrderById(1);
        System.out.println("������: "+order.getId());
        System.out.println("���: "+order.getRealname());
        System.out.println("�����ܽ��: "+order.getTotal());
        System.out.println("�ö����¹�������������Ʒ:");
        Set<OrderItem> orderItems=order.getOrderItems();
        for(OrderItem oi:orderItems) {
            System.out.println("��Ʒ��: "+oi.getProduct_id().getName()+", ��������: "+oi.getQuantity());
        }
    }
    
}
