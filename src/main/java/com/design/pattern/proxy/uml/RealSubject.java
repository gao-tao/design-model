package com.design.pattern.proxy.uml;

/**
 */
public class RealSubject implements ISubject {

    public void request() {
        System.out.println("real service is called.");
    }

}
