package com.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductAggregateImpl implements ProductAggregate{

    private List productList;

    public ProductAggregateImpl() {
        this.productList = new ArrayList();
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void remove(Product product) {
        productList.remove(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new IteratorImpl<>(productList);
    }
}
