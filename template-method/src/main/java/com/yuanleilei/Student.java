package com.yuanleilei;

public class Student extends AbstractPerson {
    @Override
    protected void dressUp() {
        System.out.println("穿校服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈做的早饭");
    }

    @Override
    protected void takeThings() {
        System.out.println("背上书包");
    }
}
