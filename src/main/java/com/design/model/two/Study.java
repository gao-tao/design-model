package com.design.model.two;

public class Study {

    private ICourse course;

    public Study(ICourse course) {
        this.course = course;
    }

    public void study(){
        course.study();
    }

}
