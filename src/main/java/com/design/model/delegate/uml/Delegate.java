package com.design.model.delegate.uml;

public class Delegate implements Task{

    @Override
    public void doTask() {
        new ConcreteA();
        new ConcreteB();
        return;
    }
}
