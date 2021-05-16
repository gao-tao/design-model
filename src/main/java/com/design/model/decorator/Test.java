package com.design.model.decorator;

import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.cache.Cache;
import org.springframework.web.servlet.HandlerAdapter;

import java.io.InputStream;

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
