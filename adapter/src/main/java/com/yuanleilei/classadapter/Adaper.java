package com.yuanleilei.classadapter;


public class Adaper extends Usber implements Ps2 {

    // 通过继承的方式，实现接口时，做适配中转
    @Override
    public void isPs2() {
        super.isUsb();
    }
}
