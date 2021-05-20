package com.design.pattern.decorator;

public class WatermelonDecorator extends CreamCakeDecorator {

    public WatermelonDecorator(CreamCake creamCake) {
        super(creamCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1小块西瓜";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 5;
    }
}
