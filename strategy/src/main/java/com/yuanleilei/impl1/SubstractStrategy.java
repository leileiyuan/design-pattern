package com.yuanleilei.impl1;

public class SubstractStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
