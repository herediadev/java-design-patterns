package main.demo2;

public class FanHighState extends State {
    private final Fan fan;

    public FanHighState(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to off");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
