package main.demo2;

import main.demo2.template.OrderTemplate;
import main.demo2.template.WebOrder;

public class TemplateMethodDemo2 {

    public static void main(String[] args) {
        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore Order");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();

    }
}
