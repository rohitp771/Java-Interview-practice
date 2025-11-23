package MultiThreading;

class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;  // Only one thread can execute this at a time
    }

    public int getCount() {
        return count;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println("Increamented in t1 Count: " + counter.getCount());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println("Increamented in t2 Count: " + counter.getCount());
            }
        });

        t1.start();
        t2.start();

        t1.join();  // wait for t1 to finish
        t2.join();  // wait for t2 to finish

        System.out.println("Final Count: " + counter.getCount());
    }
}
