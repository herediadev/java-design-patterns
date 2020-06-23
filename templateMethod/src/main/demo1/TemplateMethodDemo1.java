package main.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateMethodDemo1 {

    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "123-456-789", 29);
        Person mark = new Person("Mark", "123-456-789", 39);
        Person chris = new Person("Chris", "123-456-789", 30);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);
    }

    private static void printContents(List<Person> people) {
        people.forEach(System.out::println);
    }
}
