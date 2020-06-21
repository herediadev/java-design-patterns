package main.demo2;

public class FanLowState extends State {
    private final Fan fan;

    public FanLowState(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med");
        fan.setState(fan.getMediumState());
    }

    @Override
    public String toString() {
        return "Fan is low.";
    }
}
