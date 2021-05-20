package com.design.pattern.iterator;

import lombok.Data;

@Data
public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }
}
