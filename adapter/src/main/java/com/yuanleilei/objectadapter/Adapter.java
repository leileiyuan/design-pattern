package com.yuanleilei.objectadapter;

public class Adapter implements Ps2 {
    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    // 通过对象引用方式，做适配的中转
    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
