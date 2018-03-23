package com.yuanleilei;

import java.util.ArrayList;
import java.util.List;

public class TeacherSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String info;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (observers.size() >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(info);
        }
    }

    public void setHomeWork(String info) {
        this.info = info;
        System.out.println("今天的家庭作业是：" + info);
        this.notifyObserver();
    }
}
