package com.design.principles.dip;

/**
 * 依赖倒置原则(Dependence Inversion Principle,DIP)：高层模块不应该依赖底层模块，二者都应该依赖其抽象。抽象不应该依赖细节；细节应该依赖抽象。
 * 可以减少耦合，提高系统的稳定性，提高代码的可读性和可维护性，降低修改程序所造成的风险
 */
public class Test {

    public static void main(String[] args) {
        Study java = new Study(new JavaCourse());
        Study python = new Study(new PythonCourse());
        java.study();
        python.study();
    }
}
