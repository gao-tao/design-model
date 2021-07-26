package com.design.pattern.interpreter.operation;

import com.design.pattern.interpreter.IArithmeticInterpreter;
import com.design.pattern.interpreter.Interpreter;

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
