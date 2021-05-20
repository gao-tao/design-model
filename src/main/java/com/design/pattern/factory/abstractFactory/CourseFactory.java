package com.design.pattern.factory.abstractFactory;

public abstract class CourseFactory {


    public void init() {
        System.out.println("初始化数据");
    }

    protected abstract IVideo createVideo();

    protected abstract INote createNote();
}
