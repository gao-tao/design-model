package com.design.pattern.interpreter.uml;

// 抽象表达式
public interface IExpression {
    // 对表达式进行解释
    Object interpret(Context context);
}