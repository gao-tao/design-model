package com.design.model.factory.methods;

public class JeepCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new JeepCar();
    }
}
