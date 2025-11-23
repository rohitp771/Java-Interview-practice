public class FibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34

        int firstNum = 0;
        int secondNum = 1;
        int terms = 10;

        System.out.println("Fibonacci series ---->");

        for (int i=1;i<=terms;i++) {
            System.out.print(firstNum + " ");
             int nextNum = firstNum+secondNum;
             firstNum = secondNum;
             secondNum = nextNum;
        }
        
    }
}
