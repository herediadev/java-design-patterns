package main.demo1;

import java.util.List;

public class AllLightCommand implements Command {
    private final List<Light> lights;

    public AllLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(light -> {
            if (light.isOn())
                light.toggle();
        });
    }
}
