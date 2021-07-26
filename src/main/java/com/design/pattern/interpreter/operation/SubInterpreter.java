package com.design.pattern.interpreter.operation;

import com.design.pattern.interpreter.IArithmeticInterpreter;
import com.design.pattern.interpreter.Interpreter;

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
