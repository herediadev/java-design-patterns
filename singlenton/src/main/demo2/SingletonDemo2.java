package main.demo2;

public class SingletonDemo2 {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println("instance = " + instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println("anotherInstance = " + anotherInstance);
    }
}
