package main.demo2;

public class WebAppClient extends Observer {
    public WebAppClient(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " sent from the webapp");
    }

    @Override
    public void update() {
        System.out.println("WebApp Stream " + subject.getState());
    }
}
