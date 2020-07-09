package main.demo2;

public class DecoratorDemo2 {
    public static void main(String[] args) {
        Sandwich simpleSandwich = new SimpleSandwich();
        Sandwich meatDecorator = new MeatDecorator(simpleSandwich);
        Sandwich dressingDecorator = new DressingDecorator(meatDecorator);

        System.out.println(dressingDecorator.make());
    }
}
