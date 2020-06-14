package main.demo2;

public class AndExpression implements Expression {

    private final Expression terminalExpression1;
    private final Expression terminalExpression2;

    public AndExpression(Expression terminalExpression1, Expression terminalExpression2) {
        this.terminalExpression1 = terminalExpression1;
        this.terminalExpression2 = terminalExpression2;
    }

    @Override
    public boolean interpret(String context) {
        return terminalExpression1.interpret(context) && terminalExpression2.interpret(context);
    }
}
