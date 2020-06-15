package main.demo2;

import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        Iterator<String> bikeIterator = bikeRepository.iterator();
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
            bikeIterator.remove();
        }

        /*for (String bike : bikeRepository) {
            System.out.println(bike);
        }*/

        System.out.println("Repository size: " + bikeRepository.size());

    }
}
