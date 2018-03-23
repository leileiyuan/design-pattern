package com.yuanleilei.prototype.simple;

public class PrototypeImpl1 implements Prototype {

    @Override
    public Prototype clone() {
        return new PrototypeImpl1();
    }
}
