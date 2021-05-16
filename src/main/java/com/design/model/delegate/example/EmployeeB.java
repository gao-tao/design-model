package com.design.model.delegate.example;

public class EmployeeB implements IEmployee {

    protected String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.println("我是员工B，擅长" + goodAt + ",现在开始" + task + "工作");
    }
}
