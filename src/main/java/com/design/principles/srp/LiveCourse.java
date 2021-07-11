package com.design.principles.srp;

public class LiveCourse implements ICourse{

    public void study(String courseName){
        System.out.println(courseName + "不能快进");
    }
}
