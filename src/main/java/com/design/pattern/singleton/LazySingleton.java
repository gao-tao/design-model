package com.design.pattern.singleton;

/**
 * 优点：提高内存使用
 * 缺点：使用锁，降低执行速度
 */
public class LazySingleton {

    private LazySingleton() {
    }

    private static volatile LazySingleton singleton;

    public static LazySingleton getInstance() {
        //检查是否要阻塞
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                //判断是创建新的对象
                if (singleton == null) {
                    singleton = new LazySingleton();
                    //设置lazy指向刚分配的内存地址
                    //指令重排序的问题
                }
            }
        }
        return singleton;
    }
}
