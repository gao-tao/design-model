package com.design.pattern.decorator;

public class Test {

    public static void main(String[] args) {
        CreamCake creamCake = new BaseCreamCake();

        //加🍒
        creamCake = new CherryDecorator(creamCake);
        //加🍉
        creamCake = new WatermelonDecorator(creamCake);

        //再次加🍒
        creamCake = new CherryDecorator(creamCake);

        System.out.println(creamCake.getMsg() + ",总价：" + creamCake.getPrice());
    }
}
