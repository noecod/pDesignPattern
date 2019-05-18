package behavioural.interpreter;

import java.util.Map;

public class Variable implements IExpression {

    private String name;

    public Variable(final String name) {
        this.name = name;
    }

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        if (null == variables.get(this.name))
            return 0; // Either return new Number(0).
        return variables.get(this.name).interpret(variables);
    }
}