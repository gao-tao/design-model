package com.design.principles.lod;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public void studyOfCourse() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("学习课程:" + courses.size());
    }
}
