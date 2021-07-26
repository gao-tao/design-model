package com.design.pattern.interpreter.operation;

import com.design.pattern.interpreter.IArithmeticInterpreter;
import com.design.pattern.interpreter.Interpreter;

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
