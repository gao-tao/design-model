package com.design.pattern.factory.methods;

public class JeepCar implements ICar{
    @Override
    public void run() {
        System.out.println("Jeep在跑路");
    }
}
