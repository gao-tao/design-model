package com.design.model.component;

import org.apache.ibatis.scripting.xmltags.SqlNode;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println("=======透明组合模式============");

        Course pythonCourse = new Course("Python基础课程", 8000);

        Course aiCourse = new Course("人工智能", 10000);

        CoursePackage javaPackage = new CoursePackage("java总纲", 2);

        Course design = new Course("java design", 200);
        Course source = new Course("源码分析", 3000);
        Course softKill = new Course("软技巧", 300);

        javaPackage.addChild(design);
        javaPackage.addChild(source);
        javaPackage.addChild(softKill);


        CoursePackage catalog = new CoursePackage("课程主目录", 1);


        catalog.addChild(javaPackage);
        catalog.addChild(pythonCourse);
        catalog.addChild(aiCourse);

        catalog.print();
    }
}
