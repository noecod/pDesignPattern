package behavioural.interpreter;

import java.util.Map;

public class Plus implements IExpression {

    IExpression leftOperand;
    IExpression rightOperand;

    public Plus(final IExpression left, final IExpression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        return this.leftOperand.interpret(variables) + this.rightOperand.interpret(variables);
    }
}