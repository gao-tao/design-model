package com.design.model.factory;

public class QQCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new QQCar();
    }
}
