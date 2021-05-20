package com.design.pattern.delegate.example;

public class EmployeeA implements IEmployee{

    protected String goodAt = "设计";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，擅长" + goodAt + ",现在开始" + task + "工作");
    }
}
