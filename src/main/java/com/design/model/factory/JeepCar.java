package com.design.model.factory;

public class JeepCar implements ICar{
    @Override
    public void run() {
        System.out.println("Jeep在跑路");
    }
}
