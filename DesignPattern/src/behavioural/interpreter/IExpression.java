package behavioural.interpreter;

import java.util.Map;

public interface IExpression {

    int interpret(final Map<String, IExpression> variables);
}