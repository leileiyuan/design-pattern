package com.yuanleilei.pattern.factory.simplefactory;

import com.yuanleilei.pattern.factory.product.Milk;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Milk milk = factory.getMilk("伊利");
        System.out.print(milk.getName());
    }
}
