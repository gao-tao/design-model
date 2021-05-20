package com.design.pattern.iterator;

public class Test {

    public static void main(String[] args) {


        ProductAggregate aggregate = new ProductAggregateImpl();
        aggregate.add(new Product("毛巾"));
        aggregate.add(new Product("茶杯"));
        aggregate.add(new Product("牙膏"));
        aggregate.add(new Product("牙刷"));

        System.out.println("=============商品列表=========");
        printProducts(aggregate);


        System.out.println("=============删除商品后的列表=========");

        aggregate.remove(new Product("牙刷"));
        printProducts(aggregate);
    }

    public static void printProducts(ProductAggregate aggregate) {

        Iterator<Product> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("" + product.getName() + "");
        }
    }
}
