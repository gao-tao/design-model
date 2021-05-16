package com.design.model.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 1.使用静态内部类创建 兼顾饿汉式单例模式的内存浪费问题和synchronized的性能问题
 * 内部类在方法调用之前初始化，避免产生线程安全问题
 * 2.构造方法加入对象判断条件 防止使用反射调用构造方法创建多个对象，破坏单例
 * 3.使用readResolve方法，防止反序列化的问题
 * 通过查看源码得知当对象调用readObject读取对象产生对象时，如果发现对象内部有readResolve，则返回readResolve方法的返回值，
 * 如果不存在，则创建新的对象
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

//    序列化
//    FileInputStream fis = new FileInputStream("xx");
//    ObjectInputStream ois = new ObjectInputStream(fis);
//    LazyInnerClassSingleton o = (LazyInnerClassSingleton)ois.readObject();
//    ois.close();

    public LazyInnerClassSingleton readResolve() {
        return LazyHolder.LAZY;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return LazyHolder.LAZY;
    }
}
