package com.yuanleilei.impl1;

/**
 * 懒汉式，用到时创建，
 */
public class Singleton {
    // volatile 多线程访问时，保证对象的可见性，只创建一个实例
    private volatile static Singleton instance = null;

    private Singleton() {
    }

    /**
     * 双重检查，若实例已经创建，则不在判断锁，提高性能
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
