package multithreading;

import java.util.Stack;

public class StackMainRunner {
    public static void main(String[] args) {
//        Thread thread = new Thread();
//        thread.start();
//        t

        StackWithoutSync stackWithoutSync = new StackWithoutSync(5);
        Thread thread = new Thread(() -> {
            int counter = 0;
            while (counter < 10) {
                System.out.println("pushed.... " + stackWithoutSync.push(2));
                counter++;
            }
        });
        thread.setName("push thread");
        thread.start();

    Thread thread2 = new Thread(() -> {
        int counter = 0;
        while (counter < 10) {
            System.out.println("pop...... " + stackWithoutSync.pop());
            counter++;
        }
    });
    thread2.setName("pop thread");
    thread2.start();
    }
}

