package main.demo3;

public class BridgeDemo3 {

    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Green green = new Green();

        Circle greenCircle = new Circle(green);

        Square greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();

        System.out.println(greenCircle.color);
    }
}
