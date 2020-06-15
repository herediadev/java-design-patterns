package main.demo2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Mediator {

    private final ArrayList<Light> lights;

    public Mediator() {
        lights = new ArrayList<>();
    }

    public void register(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        Predicate<Light> isOn = Light::isOn;
        callWith(isOn.negate());
    }

    public void turnOffAllLights() {
        callWith(Light::isOn);
    }

    private void callWith(Predicate<Light> isOn) {
        lights.stream()
                .filter(isOn)
                .forEach(Light::toggle);
    }
}
