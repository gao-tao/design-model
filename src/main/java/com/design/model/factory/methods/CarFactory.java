package com.design.model.factory.methods;

public class CarFactory {

    public ICar create(Class<? extends ICar> clazz) {
        try {
            if (clazz != null) {
               return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
