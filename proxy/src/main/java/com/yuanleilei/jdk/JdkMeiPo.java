package com.yuanleilei.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理 媒婆
 */
public class JdkMeiPo implements InvocationHandler {

    // 持有目标对象
    private XieMu target;

    // 返回被代理后的对象
    public Object getinstance(XieMu target) throws Exception {
        this.target = target;
        Class<? extends XieMu> targetClass = target.getClass();

        // 字节码重组实现
        return Proxy.newProxyInstance(targetClass.getClassLoader(), targetClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("目标方法执行前。。。");
        method.invoke(target, args);
        System.out.println("目标方法执行后。。。。。。");
        return null;
    }
}
