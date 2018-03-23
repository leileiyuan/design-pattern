package com.yuanleilei.homework.abstractfactory.factory;

import com.yuanleilei.homework.abstractfactory.product.AmdCpu;
import com.yuanleilei.homework.abstractfactory.product.Cpu;
import com.yuanleilei.homework.abstractfactory.product.InterCpu;

public class CpuFactory extends AbstractFactory {
    public Cpu getAmdCpu() {
        return new AmdCpu();
    }

    public Cpu getInterCpu() {
        return new InterCpu();
    }
}
