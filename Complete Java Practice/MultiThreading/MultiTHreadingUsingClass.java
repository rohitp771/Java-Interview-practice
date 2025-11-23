package MultiThreading;

class MultiTHreadingUsingClass extends Thread {
    
    public void run(){
        System.out.println("Running thread");
    }

    public static void main(String[] args) {
        MultiTHreadingUsingClass t1 = new MultiTHreadingUsingClass();
        t1.start();
    }

}
