package com.yuanleilei.homework.factorymethod.factory;

import com.yuanleilei.homework.factorymethod.product.Banana;
import com.yuanleilei.homework.factorymethod.product.Fruits;

public class BananaFactoryImpl implements FruitsFactory {
    public Fruits getFruits() {
        return new Banana();
    }
}
