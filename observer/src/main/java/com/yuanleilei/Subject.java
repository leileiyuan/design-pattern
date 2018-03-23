package com.yuanleilei;


/**
 * 主题
 */
public interface Subject {

    // 关联观察者
    void addObserver(Observer observer);

    // 断开观察者关联
    void deleteObserver(Observer observer);

    // 主题改变时，通知给所有观察者
    void notifyObserver();
}
