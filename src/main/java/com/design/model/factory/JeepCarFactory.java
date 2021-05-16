package com.design.model.factory;

public class JeepCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new JeepCar();
    }
}
