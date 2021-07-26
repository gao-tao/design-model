package com.design.pattern.iterator.uml;

//抽象迭代器
public interface Iterator<E> {

    E next();

    boolean hasNext();
}