package main.demo3;

import main.demo3.abstraction.Color;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying color red");
    }
}
