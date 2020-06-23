package main.demo2;

import main.demo2.template.OrderTemplate;

public class StoreOrder extends OrderTemplate {
    @Override
    protected void doCheckout() {
        System.out.println("Ring up items from cart.");
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
