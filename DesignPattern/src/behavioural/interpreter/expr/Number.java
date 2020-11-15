package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Number implements IExpression {

    private final int number;

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        return this.number;
    }
}