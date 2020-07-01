package main.demo2.factory;

public class Shop extends Website {
    @Override
    void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
