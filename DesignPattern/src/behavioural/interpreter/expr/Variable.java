package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Variable implements IExpression {

    private String name;

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        if (null == variables.get(this.name))
            return 0; // Either return new Number(0).
        return variables.get(this.name).interpret(variables);
    }
}