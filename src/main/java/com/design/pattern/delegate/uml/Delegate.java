package com.design.pattern.delegate.uml;

public class Delegate implements Task{

    @Override
    public void doTask() {
        new ConcreteA();
        new ConcreteB();
        return;
    }
}
