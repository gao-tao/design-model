package com.design.pattern.birdge;

public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }

}
