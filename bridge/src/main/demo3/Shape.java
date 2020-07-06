package main.demo3;

public abstract class Shape {
    protected final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
