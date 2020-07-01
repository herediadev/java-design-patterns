package main.demo2.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteEnum siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
