package main.demo2;

public class DbSingleton {

    private static DbSingleton instance;

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        if (instance == null)
            instance = new DbSingleton();

        return instance;
    }
}
