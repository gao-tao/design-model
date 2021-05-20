package com.design.pattern.delegate.example;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{

    private Map<String,IEmployee> employee = new HashMap<>();

    public Leader(){
        employee.put("爬虫",new EmployeeB());
        employee.put("海报",new EmployeeA());
    }

    @Override
    public void doing(String task) {

        if(!employee.containsKey(task)){
            System.out.println("我做不了这个工作"+task);
            return;
        }
        employee.get(task).doing(task);
    }
}
