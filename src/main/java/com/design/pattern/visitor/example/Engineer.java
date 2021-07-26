package com.design.pattern.visitor.example;

import java.util.Random;

/**
 * 程序员
 */
public class Engineer extends Employee{

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //程序员一年的代码量
    public int getCodeLines(){
        return new Random().nextInt(10 * 10000);
    }
}
