package com.yuanleilei.homework.abstractfactory.client;

import com.yuanleilei.homework.abstractfactory.factory.CpuFactory;
import com.yuanleilei.homework.abstractfactory.product.Cpu;

public class Client {
    public static void main(String[] args) {
        CpuFactory factory = new CpuFactory();
        Cpu cpu = factory.getAmdCpu();
        System.out.println(cpu.getName());
    }
}
