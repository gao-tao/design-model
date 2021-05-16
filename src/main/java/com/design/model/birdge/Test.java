package com.design.model.birdge;

public class Test {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
