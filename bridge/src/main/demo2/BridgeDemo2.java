package main.demo2;

public class BridgeDemo2 {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Square square = new RedSquare();
        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
