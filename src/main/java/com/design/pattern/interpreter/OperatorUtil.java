package com.design.pattern.interpreter;

import com.design.pattern.interpreter.operation.AddInterpreter;
import com.design.pattern.interpreter.operation.DivInterpreter;
import com.design.pattern.interpreter.operation.MulInterpreter;
import com.design.pattern.interpreter.operation.SubInterpreter;

public class OperatorUtil {

    public static boolean ifOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/"));
    }

    public static Interpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(left, right);
        } else if (symbol.equals("-")) {
            return new SubInterpreter(left, right);
        } else if (symbol.equals("*")) {
            return new MulInterpreter(left, right);
        } else if (symbol.equals("/")) {
            return new DivInterpreter(left, right);
        }
        return null;
    }
}
