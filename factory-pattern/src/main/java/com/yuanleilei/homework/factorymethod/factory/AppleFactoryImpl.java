package com.yuanleilei.homework.factorymethod.factory;

import com.yuanleilei.homework.factorymethod.product.Apple;
import com.yuanleilei.homework.factorymethod.product.Fruits;

public class AppleFactoryImpl implements FruitsFactory{
    public Fruits getFruits() {
        return new Apple();
    }
}
