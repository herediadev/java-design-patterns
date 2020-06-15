package main.demo2;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[2];
        index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
        }

        bikes[index] = bike;
        index++;
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                String[] shrunkenBikes = new String[bikes.length - 1];
                System.arraycopy(bikes, 1, shrunkenBikes, 0, bikes.length - 1);
                bikes = shrunkenBikes;
                currentIndex--;
            }
        };
    }

    public int size() {
        return bikes.length;
    }
}
