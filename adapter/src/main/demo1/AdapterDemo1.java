package main.demo1;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo1 {
    public static void main(String[] args) {
        Integer[] arrayOfInts = {42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
