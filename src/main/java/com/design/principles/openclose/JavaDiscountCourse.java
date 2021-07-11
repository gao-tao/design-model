package com.design.principles.openclose;

/**
 * 开闭原则(Open-Closed principle,OCP)：对扩展开放，对修改关闭
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.5;
    }

}
