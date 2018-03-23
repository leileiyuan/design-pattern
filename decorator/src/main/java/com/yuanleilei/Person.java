package com.yuanleilei;

public class Person implements Human {
    public Person() {
    }

    @Override
    public void wearClothes() {
        System.out.println("穿什么");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪儿");
    }
}
