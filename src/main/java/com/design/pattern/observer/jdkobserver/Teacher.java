package com.design.pattern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Platform platform = (Platform) o;
        Question question = (Question) arg;

        System.out.println("========================");

        System.out.println(name + "老师\n" +
                "你收到来自" + platform.getName() + "的提问，希望你解答，内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
