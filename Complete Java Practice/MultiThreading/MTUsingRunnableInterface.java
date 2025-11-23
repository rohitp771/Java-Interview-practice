package MultiThreading;

public class MTUsingRunnableInterface implements Runnable{
    
    public void run(){
        System.out.println("Running thred...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MTUsingRunnableInterface());
        t1.start();
    }
}
