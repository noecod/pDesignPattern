package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;

public record Minus(IExpression leftOperand, IExpression rightOperand) implements IExpression {

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}