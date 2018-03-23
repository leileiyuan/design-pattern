package com.yuanleilei.staticed;

public class Proxy implements  Subject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("代理之间干点儿事");
        realSubject.request();
        System.out.println("代理之后干了点事");
    }
}
