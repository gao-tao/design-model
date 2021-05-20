package com.design.pattern.singleton;

/**
 * ThreadLocal不能保证全局唯一，但是可以保证单个线程唯一，天生线程安全
 * 每个对象都会放到ThreadLocalMap中，为每个线程提供一个对象，空间换实现实现线程隔离。
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
