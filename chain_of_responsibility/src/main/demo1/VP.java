package main.demo1;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(RequestType.PURCHASE.equals(request.getRequestType()) && request.getAmount() <= 1000)
            System.out.println("Vp approved");
        else
            handler.handleRequest(request);
    }
}
