package behavioural.interpreter;

import java.util.Map;

public class Number implements IExpression {

    private int number;

    public Number(final int number) {
        this.number = number;
    }

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        return this.number;
    }
}