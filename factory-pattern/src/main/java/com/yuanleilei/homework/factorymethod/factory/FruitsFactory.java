package com.yuanleilei.homework.factorymethod.factory;

import com.yuanleilei.homework.factorymethod.product.Fruits;

/**
 * 采摘水果工厂。
 * 工厂方法模式，定义创建对象的接口，子类决定实例化哪个类
 */
public interface FruitsFactory {
    public Fruits getFruits();
}
