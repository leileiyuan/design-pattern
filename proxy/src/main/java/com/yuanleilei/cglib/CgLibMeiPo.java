package com.yuanleilei.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib 动态代理
 */
public class CgLibMeiPo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception {

        Enhancer enhancer = new Enhancer();

        // 要把哪个设置为即将生成的新父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("目标方法执行前。。。");

        // 业务的增强
        methodProxy.invokeSuper(o, objects);

        System.out.println("目标方法执行后。。。。。。");
        return o;
    }
}
