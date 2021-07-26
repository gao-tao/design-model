package com.design.pattern.adapter.uml.classadapter;

/**
 */
public class Adapter extends Adaptee implements Target {
    public int request() {
        return super.specificRequest() / 10;
    }
}
