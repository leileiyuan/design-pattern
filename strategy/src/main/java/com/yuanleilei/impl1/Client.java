package com.yuanleilei.impl1;

public class Client {
    public static void main(String[] args) {

        Context context = new Context(StrategyType.add);
        System.out.println(context.calculate(10, 2));

        Context context2 = new Context(StrategyType.division);
        System.out.println(context2.calculate(10, 2));

        Context context3 = new Context(StrategyType.multiply);
        System.out.println(context3.calculate(10, 2));

        Context context4 = new Context(StrategyType.substract);
        System.out.println(context4.calculate(10, 2));
    }
}
