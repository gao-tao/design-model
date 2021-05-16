package com.design.model.factory.methods;

public class QQCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new QQCar();
    }
}
