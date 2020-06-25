package main.demo1;

public class VisitorDemo1 {

    public static void main(String[] args) {
        PartsOrder partsOrder = new PartsOrder();
        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Fender());
        partsOrder.addPart(new Oil());

        double shipping = partsOrder.calculateShipping();

        System.out.println(shipping);
    }
}
