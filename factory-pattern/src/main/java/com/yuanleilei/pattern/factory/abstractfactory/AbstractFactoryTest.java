package com.yuanleilei.pattern.factory.abstractfactory;

import com.yuanleilei.pattern.factory.product.Milk;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory factory = new MilkFactory();
        Milk milk = factory.getTelunsu();
        System.out.print(milk.getName());
    }

}
