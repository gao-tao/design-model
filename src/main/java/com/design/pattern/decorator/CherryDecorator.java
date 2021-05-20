package com.design.pattern.decorator;

public class CherryDecorator extends CreamCakeDecorator{

    public CherryDecorator(CreamCake creamCake) {
        super(creamCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "10个樱桃";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 10;
    }
}
