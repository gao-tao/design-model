package com.design.model.factory.abstractFactory;

public class ChineseVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制课程");
    }
}
