package com.design.model.factory.methods;

public class Test {
    public static void main(String[] args) {

//        CarFactory carFactory = new CarFactory();
//        ICar car = carFactory.create(JeepCar.class);
//        car.run();

        ICarFactory factory = new JeepCarFactory();
        ICar car = factory.create();
        car.run();

        factory = new QQCarFactory();
        car = factory.create();
        car.run();

    }
}
