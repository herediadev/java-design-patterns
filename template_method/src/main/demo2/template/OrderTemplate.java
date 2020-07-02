package main.demo2.template;

public abstract class OrderTemplate {
    private boolean isGift;

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift)
            wrapGift();
        else
            doReceipt();

        doDelivery();
    }

    protected final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    protected abstract void doCheckout();

    protected abstract void doPayment();

    protected abstract void doReceipt();

    protected abstract void doDelivery();
}
