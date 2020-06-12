package main;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {
    public static void main(String[] args) {
        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedRoomLight);

        lightSwitch.storeAndExecute(toggleCommand);
        /*lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);*/

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedRoomLight);

        Command allLightsCommand = new AllLightCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
