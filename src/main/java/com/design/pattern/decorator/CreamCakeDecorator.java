package com.design.pattern.decorator;

public abstract class CreamCakeDecorator extends CreamCake{

    private CreamCake creamCake;

    public CreamCakeDecorator(CreamCake creamCake) {
        this.creamCake = creamCake;
    }

    @Override
    protected String getMsg() {
        return this.creamCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.creamCake.getPrice();
    }
}
