package com.design.model.proxy.use;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Medium implements InvocationHandler {

    public IPerson person;

    public IPerson getInstance(IPerson person) {
        this.person = person;
        Class<? extends IPerson> clazz = person.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.person, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("结束寻找");
    }

    private void before() {
        System.out.println("开始寻找");
    }
}
