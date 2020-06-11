package main.chain;

public class Request {
    private final RequestType conference;
    private final int value;

    public Request(RequestType conference, int value) {
        this.conference = conference;
        this.value = value;
    }

    public RequestType getConference() {
        return conference;
    }

    public int getValue() {
        return value;
    }
}
