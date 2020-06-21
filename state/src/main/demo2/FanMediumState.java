package main.demo2;

public class FanMediumState extends State {
    private final Fan fan;

    public FanMediumState(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "Fan is Medium";
    }
}
