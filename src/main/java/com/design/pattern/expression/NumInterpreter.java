package com.design.pattern.expression;

/**
 * 数字表达式
 */
public class NumInterpreter implements IArithmeticInterpreter{

    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    public int interpret() {
        return this.value;
    }
}
