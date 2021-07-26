package com.design.pattern.visitor.uml;

// 抽象访问者
public interface IVisitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}