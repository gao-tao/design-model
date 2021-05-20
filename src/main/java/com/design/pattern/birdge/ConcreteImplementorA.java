package com.design.pattern.birdge;

public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor A");
    }
}
