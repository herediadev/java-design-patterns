package main;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(RequestType.CONFERENCE.equals(request.getRequestType()))
            System.out.println("Director approved");
        else
            handler.handleRequest(request);

    }
}
