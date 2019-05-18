package behavioural.interpreter;

import java.util.Map;

public interface IExpression {

    public int interpret(final Map<String, IExpression> variables);
}