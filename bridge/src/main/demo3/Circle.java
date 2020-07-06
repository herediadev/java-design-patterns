package main.demo3;

import main.demo3.abstraction.Color;
import main.demo3.abstraction.Shape;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
