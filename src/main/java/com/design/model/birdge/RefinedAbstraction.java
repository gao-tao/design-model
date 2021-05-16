package com.design.model.birdge;

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
