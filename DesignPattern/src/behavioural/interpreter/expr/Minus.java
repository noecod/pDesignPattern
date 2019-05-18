package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Minus implements IExpression {

    IExpression leftOperand;
    IExpression rightOperand;

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        return this.leftOperand.interpret(variables) - this.rightOperand.interpret(variables);
    }
}