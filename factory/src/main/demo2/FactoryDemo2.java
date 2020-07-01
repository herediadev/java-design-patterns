package main.demo2;

import main.demo2.factory.Website;
import main.demo2.factory.WebsiteEnum;
import main.demo2.factory.WebsiteFactory;

public class FactoryDemo2 {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteEnum.BLOG);

        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteEnum.SHOP);

        System.out.println(website.getPages());
    }
}
