package com.design.model.singleton;

/**
 * 优点：线程绝对安全。执行效率比较高
 * 缺点：所有对象加载的时候就要实例化，如果有大批量单例对象创建，占用大量内存，浪费内存资源
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
