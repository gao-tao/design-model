package com.design.pattern.singleton;

/**
 * 注意优雅的方式
 * 通过查看源码发现枚举采用的是饿汉式单例模式的创建方法
 * 并发安全在、不会被发射和反序列化破坏
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    private Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
