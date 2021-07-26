package com.design.pattern.observer.jdkobserver;

import lombok.Getter;

import java.util.Observable;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 */
public class Platform extends Observable {

    @Getter
    private String name = "平台";

    private static Platform platform = new Platform();

    public static Platform getInstance(){
        return platform;
    }

    private Platform() {
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
