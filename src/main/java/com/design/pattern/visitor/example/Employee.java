package com.design.pattern.visitor.example;

import java.util.Random;

/**
 * 员工基类
 * 定义程序员和项目经理实现，二者职责不同，正因为差异，使得访问者模式发挥作用。
 * 这里Employee、Engineer、Manager这3个类型就相当于数据结构，类型相对稳定，
 * 不会发生变化。
 */
public abstract class Employee {

    public String name;

    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    //核心方法，接受访问者的访问
    public abstract void accept(IVisitor visitor);
}
