package com.design.pattern.expression.operation;

import com.design.pattern.expression.IArithmeticInterpreter;
import com.design.pattern.expression.Interpreter;

/**
 * 除法表达式
 */
public class DivInterpreter extends Interpreter {

    public DivInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}
