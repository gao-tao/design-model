package com.design.pattern.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

    public static void main(String[] args) {
        System.out.println("result:" + new Calculator("10 + 30").calculate());


        System.out.println("=========================");

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("10+30");
        int result = (Integer) expression.getValue();
        System.out.println("结果：" + result);
    }
}
