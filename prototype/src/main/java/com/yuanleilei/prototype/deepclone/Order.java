package com.yuanleilei.prototype.deepclone;

/**
 * 克隆时 要对引用对象Product做深度克隆
 */
public class Order implements Cloneable {

    // 订购人
    private int customerName;
    // 产品对象，
    private Product product;
    // 订单产品数量
    private int orderProductNum = 0;

    public int getCustomerName() {
        return customerName;
    }

    public void setCustomerName(int customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public String toString() {
        return "OrderImpl{" +
                "customerName=" + customerName +
                ", product=" + product +
                ", orderProductNum=" + orderProductNum +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Order order = (Order)super.clone();
        order.setProduct((Product) product.clone());
        return order;
    }
}
