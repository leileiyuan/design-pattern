package com.yuanleilei.homework;

public class IDCard {
    private IDCard() {
    }

    public static IDCard getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static IDCard instance = new IDCard();
    }
}
