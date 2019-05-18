package behavioural.interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements IExpression {

    private IExpression syntaxTree;

    public Evaluator(final String expression) {
        final Stack<IExpression> expressionStack = new Stack<>();
        for (final String token : expression.split(" ")) {
            if (token.equals("+")) {
                final IExpression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                // it's necessary remove first the right operand from the stack
                final IExpression right = expressionStack.pop();
                // ..and after the left one
                final IExpression left = expressionStack.pop();
                final IExpression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            } else
                expressionStack.push(new Variable(token));
        }
        this.syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(final Map<String, IExpression> context) {
        return this.syntaxTree.interpret(context);
    }
}