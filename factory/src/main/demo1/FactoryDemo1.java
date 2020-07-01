package main.demo1;

import java.util.Calendar;

public class FactoryDemo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        calendar.get(Calendar.DAY_OF_MONTH);
    }
}
