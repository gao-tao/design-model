package com.design.principles.srp;

public class ReplayCourse implements ICourse{

    public void study(String courseName){
        System.out.println("可以快进");
    }
}
