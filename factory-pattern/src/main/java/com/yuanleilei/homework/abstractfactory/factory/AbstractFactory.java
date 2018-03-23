package com.yuanleilei.homework.abstractfactory.factory;

import com.yuanleilei.homework.abstractfactory.product.Cpu;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Cpu getAmdCpu();

    public abstract Cpu getInterCpu();
}
