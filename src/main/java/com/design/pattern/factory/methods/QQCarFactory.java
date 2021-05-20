package com.design.pattern.factory.methods;

public class QQCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new QQCar();
    }
}
