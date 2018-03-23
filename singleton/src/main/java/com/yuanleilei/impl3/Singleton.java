package com.yuanleilei.impl3;

/**
 * 静态内部类方式创建单实例，内部类在调用Holder.instance时进行加载，并创建实例。
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static Singleton instance = new Singleton();
    }
}
