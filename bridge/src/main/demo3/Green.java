package main.demo3;

import main.demo3.abstraction.Color;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying color green");
    }
}
