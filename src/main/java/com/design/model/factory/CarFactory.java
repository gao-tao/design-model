package com.design.model.factory;

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
