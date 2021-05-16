package com.design.model.two;

public class Test {

    public static void main(String[] args) {
        Study java = new Study(new JavaCourse());
        Study python = new Study(new PythonCourse());
        java.study();
        python.study();
    }
}
