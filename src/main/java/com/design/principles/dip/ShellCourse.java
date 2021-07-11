package com.design.principles.dip;

public class ShellCourse implements ICourse{

    @Override
    public void study() {
        System.out.println("小明在学习Shell");
    }
}
