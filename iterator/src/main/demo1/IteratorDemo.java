package main.demo1;

import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        for (String name : names) {
            System.out.println(name);
        }

        /*Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            namesIterator.remove();
        }*/

        System.out.println("Names size: " + names.size());

    }
}
