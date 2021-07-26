package com.design.pattern.expression.operation;

import com.design.pattern.expression.IArithmeticInterpreter;
import com.design.pattern.expression.Interpreter;

/**
 * 减法表达式
 */
public class SubInterpreter extends Interpreter {

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }

    public SubInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }
}
