package com.yuanleilei;

public class StudentObserver implements Observer {

    private TeacherSubject subject;

    private String name;

    public StudentObserver(TeacherSubject subject, String name) {
        this.subject = subject;
        this.name = name;
        //新建的学生默认加到观察者
        subject.addObserver(this);
    }

    @Override
    public void update(String info) {
        System.out.println(name + "得到的作业是：" + info);
    }
}
