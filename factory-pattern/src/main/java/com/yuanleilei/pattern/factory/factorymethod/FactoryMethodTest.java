package com.yuanleilei.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factory = new TelunsuFactory();
        System.out.print(factory.getMilk().getName());
    }
}
