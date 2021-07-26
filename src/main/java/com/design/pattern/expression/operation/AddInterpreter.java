package com.design.pattern.expression.operation;

import com.design.pattern.expression.IArithmeticInterpreter;
import com.design.pattern.expression.Interpreter;

/**
 * 加法表达式
 */
public class AddInterpreter extends Interpreter {

    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}
