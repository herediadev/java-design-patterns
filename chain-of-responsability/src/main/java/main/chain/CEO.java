package main.chain;

public class CEO implements Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("I am the CEO, i will approve everything " + request.getValue());
    }
}
