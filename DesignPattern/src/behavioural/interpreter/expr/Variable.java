package behavioural.interpreter.expr;

import java.util.Map;

import behavioural.interpreter.IExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Variable implements IExpression {

    private final String name;

    @Override
    public int interpret(final Map<String, IExpression> variables) {
        if (variables.get(this.name) == null) {
            return 0;
        }
        return variables.get(this.name).interpret(variables);
    }
}