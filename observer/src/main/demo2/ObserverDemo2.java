package main.demo2;

public class ObserverDemo2 {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TableClient tabletClient = new TableClient(subject);
        WebAppClient webAppClient = new WebAppClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Here is a new message!");
        webAppClient.addMessage("Here is a new message!");
    }
}
