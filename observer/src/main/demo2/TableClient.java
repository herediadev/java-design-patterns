package main.demo2;

public class TableClient extends Observer {

    public TableClient(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " sent from tablet");
    }

    @Override
    public void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }
}
