package com.yuanleilei.staticed;

public class RealSubject implements  Subject{
    @Override
    public void request() {
        System.out.println("要做的事");
    }
}
