package com.yuanleilei.impl1;

public enum StrategyType {
    add(new AddStrategy()),
    division(new DivisionStrategy()),
    multiply(new MultiplyStrategy()),
    substract(new SubstractStrategy());

    private Strategy strategy;

    private StrategyType(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
