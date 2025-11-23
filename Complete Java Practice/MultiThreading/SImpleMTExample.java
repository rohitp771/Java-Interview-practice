package MultiThreading;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Task 1: " + i);
    }

}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Task 2: " + i);
    }
}

public class SImpleMTExample{

    public static void main(String[] args) {
        new Task1().start();
        new Task2().start();
    }
    
}
