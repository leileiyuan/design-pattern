package com.yuanleilei.prototype;

public class Test {

    public static void main(String[] args) throws Exception{

        Message msg = new Message();
        msg.setContext(new Context("connnnnn"));

        Message msg2 = (Message)msg.clone();

        System.out.println(msg == msg2);

        // 深度克隆后的，返回false，两个引用指向的不是的实例对象
        System.out.println(msg.getContext() == msg2.getContext());
    }
}
