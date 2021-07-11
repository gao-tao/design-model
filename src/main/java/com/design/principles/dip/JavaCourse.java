package com.design.principles.dip;

public class JavaCourse implements ICourse{

    @Override
    public void study() {
        System.out.println("小明在学习java");
    }
}
