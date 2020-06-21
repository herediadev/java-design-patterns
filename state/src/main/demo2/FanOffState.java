package main.demo2;

public class FanOffState extends State {
    private final Fan fan;

    public FanOffState(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
