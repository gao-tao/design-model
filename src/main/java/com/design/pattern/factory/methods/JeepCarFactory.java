package com.design.pattern.factory.methods;

public class JeepCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new JeepCar();
    }
}
