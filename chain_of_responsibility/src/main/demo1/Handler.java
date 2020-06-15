package main.demo1;

public abstract class Handler {
    protected Handler handler;

    public void setSuccessor(Handler handle) {
        this.handler = handle;
    }

    public abstract void handleRequest(Request request);
}
