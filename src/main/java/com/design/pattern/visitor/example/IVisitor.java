package com.design.pattern.visitor.example;

/**
 * 如果这里没有 进行分类处理  那么就需要在ceo和cto访问者visit方法进行判断
 * 重载的visit方法会对元素进行不同的额操作，而通过注入不同的访问者又可以替换掉访问者的具体实现
 * 使得对元素的操作变得更灵活，扩展性更高。同时消除了类型转换、if-else等代码
 */
public interface IVisitor {

    //访问程序员类型
    void visit(Engineer engineer);

    //访问工程师类型
    void visit(Manager manager);
}
