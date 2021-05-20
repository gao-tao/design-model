package com.design.pattern.delegate.uml;

public class ConcreteB implements Task{

    @Override
    public void doTask() {
        System.out.println("ConcreteA");
    }
}
