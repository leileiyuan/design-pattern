package com.yuanleilei.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原对象

        Product product1 = new Product();
        product1.setName("产品1");
        product1.setId("1111");

        Order order1 = new Order();
        order1.setProduct(product1);
        // 设置原型实例的参数
        order1.setOrderProductNum(100);


        System.out.println("原型实例    :" + order1);

        //  深度克隆
        Order order2 = (Order) order1.clone();
        order2.setOrderProductNum(80);
        order2.getProduct().setName("产品2");
        order2.getProduct().setId("222");

        System.out.println("克隆出的实例:" + order2);

        System.out.println("原型实例    :" + order1);

    }
}
