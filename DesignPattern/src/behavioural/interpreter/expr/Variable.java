package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;

public record Variable(String name) implements IExpression {

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        if (variables.get(name) == null) {
            return 0;
        }
        return variables.get(name).interpret(variables);
    }
}