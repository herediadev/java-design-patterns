package main.chain;

public class Director implements Handler {
    private Handler handler;

    public void setSuccessor(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getConference().equals(RequestType.CONFERENCE) && request.getValue() <= 500)
            System.out.println("Approve by Director, amount:" + request.getValue());
        else
            handler.handleRequest(request);
    }
}
