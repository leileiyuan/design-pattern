package com.yuanleilei.impl1;

public class DivisionStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        throw new RuntimeException("除数不能为零");
    }
}
