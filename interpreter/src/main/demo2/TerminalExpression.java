package main.demo2;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
    private final String expression;

    public TerminalExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken();
            if (test.equals(expression))
                return true;
        }

        return false;
    }
}
