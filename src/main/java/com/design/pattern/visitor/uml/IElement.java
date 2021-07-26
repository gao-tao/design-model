package com.design.pattern.visitor.uml;

// 抽象元素
public interface IElement {
    void accept(IVisitor visitor);
}