package main.demo2;

public class Fan {

    private final State fanOffState;
    private final State fanLowState;
    private final State fanMediumState;
    private final State fanHighState;

    private State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

    public State getLowState() {
        return fanLowState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getMediumState() {
        return fanMediumState;
    }

    public State getOffState() {
        return fanOffState;
    }

    public State getHighState() {
        return fanHighState;
    }
}
