package main.demo2.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
