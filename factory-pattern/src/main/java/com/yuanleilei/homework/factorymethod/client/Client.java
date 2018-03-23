package com.yuanleilei.homework.factorymethod.client;

import com.yuanleilei.homework.factorymethod.factory.AppleFactoryImpl;
import com.yuanleilei.homework.factorymethod.factory.BananaFactoryImpl;
import com.yuanleilei.homework.factorymethod.factory.FruitsFactory;
import com.yuanleilei.homework.factorymethod.product.Fruits;

public class Client {
    public static void main(String[] args) {

        FruitsFactory factory1 = new AppleFactoryImpl();
        Fruits fruits1 = factory1.getFruits();

        FruitsFactory factory2 = new BananaFactoryImpl();
        Fruits fruits2 = factory2.getFruits();

        System.out.println(fruits1.getFruitName());
        System.out.println(fruits2.getFruitName());
    }
}
