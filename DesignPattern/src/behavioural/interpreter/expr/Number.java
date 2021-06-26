package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;

public record Number(int number) implements IExpression {

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        return number;
    }
}