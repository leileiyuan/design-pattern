package com.yuanleilei.prototype.simple;

public class PrototypeImpl2 implements Prototype {

    @Override
    public Prototype clone() {
        return new PrototypeImpl2();
    }
}
