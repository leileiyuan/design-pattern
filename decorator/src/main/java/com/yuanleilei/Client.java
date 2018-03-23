package com.yuanleilei;

public class Client {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new DecoratorTwo(new DecoratorFirst(new DecoratorZero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
