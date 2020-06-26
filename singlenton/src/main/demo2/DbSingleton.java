package main.demo2;

public class DbSingleton {

    private static final DbSingleton instance = new DbSingleton();

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        return instance;
    }
}
