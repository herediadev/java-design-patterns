package main.demo1;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO approved");
    }
}
