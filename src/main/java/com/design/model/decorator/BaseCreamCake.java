package com.design.model.decorator;

public class BaseCreamCake extends CreamCake{

    @Override
    protected String getMsg() {
        return "奶油蛋糕";
    }

    @Override
    protected int getPrice() {
        return 100;
    }
}
