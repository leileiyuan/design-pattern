package com.yuanleilei.impl1;

public class Context {
    private StrategyType strategyType;

    public StrategyType getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(StrategyType strategyType) {
        this.strategyType = strategyType;
    }

    public Context(StrategyType strategyType) {

        this.strategyType = strategyType;
    }

    public int calculate(int a, int b) {
        return strategyType.getStrategy().calculate(a, b);
    }
}
