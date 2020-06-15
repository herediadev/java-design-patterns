package main.demo1;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo1 {

    private final Timer timer;
    private final Toolkit toolkit;

    public MediatorDemo1(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println("About to schedule a task");
        new MediatorDemo1(3);
        System.out.println("Task scheduled.");
    }

    private class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
            toolkit.beep();
        }
    }

    private class RemindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }
}
