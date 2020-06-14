package main.demo2;

public class InterpreterDemo2 {

    static Expression buildInterpreterTree() {

        Expression withLions = new TerminalExpression("Lions");
        Expression withTigers = new TerminalExpression("Tigers");
        Expression withBears = new TerminalExpression("Bears");

        //Tigers and Bear
        AndExpression withTigerAndWithBears = new AndExpression(withTigers, withBears);

        //Lions or (Tigers and Bears)
        OrExpression withLionsOr_WithTigersAndBears = new OrExpression(withLions, withTigerAndWithBears);

        return new AndExpression(withBears, withLionsOr_WithTigersAndBears);
    }

    /**
     * main method - build the interpreter and then interpret a specific
     * sequence
     *
     * @param args: command line arguments
     */
    public static void main(String[] args) {
        //String context = "Lions";
        //String context = "Tigers";
        //String context = "Bears";
        //String context = "Lions Tigers";
        //String context = "Lions Bears";
        //String context = "Tigers Bears";
        String context = "Lions Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
