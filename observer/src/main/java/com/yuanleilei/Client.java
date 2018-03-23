package com.yuanleilei;

public class Client {
    public static void main(String[] args) {
        TeacherSubject subject = new TeacherSubject();

        StudentObserver stu1 = new StudentObserver(subject,"stu1");
        StudentObserver stu2 = new StudentObserver(subject,"stu2");
        StudentObserver stu3 = new StudentObserver(subject,"stu3");

        subject.deleteObserver(stu2);

        subject.setHomeWork("学习proxy模式");
        subject.setHomeWork("学习observer模式");
        subject.setHomeWork("学习mybatis源码");
    }
}
