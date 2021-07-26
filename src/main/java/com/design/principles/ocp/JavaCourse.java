package com.design.principles.ocp;

public class JavaCourse implements ICourse {

    private String name;

    private Double price;

    public JavaCourse(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
