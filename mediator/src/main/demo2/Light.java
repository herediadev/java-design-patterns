package main.demo2;

//receiver
public class Light {

    private final String value;
    private boolean isOn = false;

    public Light(String value) {
        this.value = value;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("Light swicthed on.");
    }

    public void off() {
        System.out.println("Light switched off");
    }
}
