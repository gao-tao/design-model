package com.design.pattern.observer.uml;

//抽象观察者
public interface IObserver<E> {
    void update(E event);
}