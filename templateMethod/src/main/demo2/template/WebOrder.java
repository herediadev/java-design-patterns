package main.demo2.template;

public class WebOrder extends OrderTemplate {

    @Override
    protected void doCheckout() {
        System.out.println("get items from cart,");
        System.out.println("Set gift preferences,");
        System.out.println("Set delivery address,");
        System.out.println("Set billing address");
    }

    @Override
    protected void doPayment() {
        System.out.println("Process pay,ent without Card present");
    }

    @Override
    protected void doReceipt() {
        System.out.println("Ship the item to address");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Email receipt");
    }
}
