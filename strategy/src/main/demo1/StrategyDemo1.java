package main.demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo1 {

    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "123-456-789", 29);
        Person mark = new Person("Mark", "123-456-789", 39);
        Person chris = new Person("Chris", "123-456-789", 40);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("\nSorted by age");
        printContents(people);

        people.sort(Comparator.comparing(Person::getName));

        System.out.println("\nSorted by name");
        printContents(people);
    }

    private static void printContents(List<Person> people) {
        people.forEach(System.out::println);
    }
}
