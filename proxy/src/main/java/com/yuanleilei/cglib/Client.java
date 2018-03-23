package com.yuanleilei.cglib;

public class Client {
    public static void main(String[] args) {
        try {
            XiaoSan instance = (XiaoSan)new CgLibMeiPo().getInstance(XiaoSan.class);
            instance.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
