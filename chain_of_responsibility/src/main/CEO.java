package main;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO approved");
    }
}
