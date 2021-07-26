package com.design.pattern.expression.operation;

import com.design.pattern.expression.IArithmeticInterpreter;
import com.design.pattern.expression.Interpreter;

/**
 * 乘法表达式
 */
public class MulInterpreter extends Interpreter {

    public MulInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }
}
