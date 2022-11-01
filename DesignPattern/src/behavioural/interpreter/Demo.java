package behavioural.interpreter;

import java.util.HashMap;
import java.util.Map;

import behavioural.interpreter.expr.Number;

public class Demo {

    public static void main(final String[] args) {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        Map<String, IExpression> variables = new HashMap<>();

        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));

        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}