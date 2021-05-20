package com.design.pattern.iterator;

public interface ProductAggregate {

    void add(Product product);

    void remove(Product product);

    Iterator<Product> iterator();
}
