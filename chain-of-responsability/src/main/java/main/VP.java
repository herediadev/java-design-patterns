package main;

import main.chain.Handler;
import main.chain.Request;
import main.chain.RequestType;

public class VP implements Handler {
    private Handler handler;

    public void setSuccessor(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getConference().equals(RequestType.PURCHASE) && request.getValue() <= 1000)
            System.out.println("Approve by VP, amount:" + request.getValue());
        else
            handler.handleRequest(request);

    }
}
