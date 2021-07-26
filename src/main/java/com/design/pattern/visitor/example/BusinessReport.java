package com.design.pattern.visitor.example;

import java.util.LinkedList;
import java.util.List;

/**
 * 员工业务报表类
 */
public class BusinessReport {

    private List<Employee> employees = new LinkedList<>();

    public BusinessReport() {
        employees.add(new Manager("经理-A"));
        employees.add(new Engineer("程序员-A"));
        employees.add(new Manager("经理-B"));
        employees.add(new Engineer("程序员-B"));
        employees.add(new Engineer("程序员-C"));
        employees.add(new Engineer("程序员-D"));
        employees.add(new Manager("经理-C"));
    }

    /**
     * 为访问者展示报表
     *
     * @param visitor 领导，如CEO、CTO
     */
    public void showReport(IVisitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }

}
