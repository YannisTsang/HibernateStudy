package com.hibernate.test.entity;

public class OrderItem implements java.io.Serializable{

    private Product product_id;
    private Order order_id;
    private Integer quantity;
    private Double purchase;
    public OrderItem() {}
    public OrderItem(Product product_id,Order order_id,Integer quantity,Double purchase) {
        this.product_id=product_id;
        this.order_id=order_id;
        this.quantity=quantity;
        this.purchase=purchase;
    }
    
    public Product getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }
    public Order getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPurchase() {
        return purchase;
    }
    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }
    
}
