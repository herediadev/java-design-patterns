package main.demo1;

public class SingletonDemo1 {

    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();

        System.out.println("singletonRuntime = " + singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println("anotherInstance = " + anotherInstance);

        if (singletonRuntime == anotherInstance)
            System.out.println("They are the same instance");

    }
}
