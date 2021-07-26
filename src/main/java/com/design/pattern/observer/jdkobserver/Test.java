package com.design.pattern.observer.jdkobserver;

public class Test {

    public static void main(String[] args) {
        Platform platform = Platform.getInstance();

        Teacher small = new Teacher("大白");
        Teacher big = new Teacher("小白");

        platform.addObserver(small);
        platform.addObserver(big);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者的用法？");

        platform.publishQuestion(question);
    }
}
