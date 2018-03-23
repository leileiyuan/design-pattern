package com.yuanleilei.jdk;

public class Client {
    public static void main(String[] args) throws Exception {
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        Person instance = (Person)jdkMeiPo.getinstance(new XieMu());
        instance.findLove();
    }
}
