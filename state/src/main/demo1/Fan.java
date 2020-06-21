package main.demo1;

public class Fan {

    private final static int OFF = 0;
    private final static int LOW = 1;
    private final static int MED = 2;

    private int state = OFF;

    public Fan() {
    }

    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turing fan low to medium");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turing fan to off");
            state = OFF;
        }
    }

    @Override
    public String toString() {
        if (state == OFF) {
            return "Fan is off";
        } else if (state == LOW) {
            return "Fan is on low";
        } else if (state == MED) {
            return "Fan is on medium";
        }

        return "Invalid state";
    }
}
