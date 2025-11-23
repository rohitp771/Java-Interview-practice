public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num = 13;
        boolean isNotPrime = false;

        if (num <= 1) {
            isNotPrime = true; // 0, 1, and negative numbers are not prime
        } else {
            int counter = 2;
            while (counter <= Math.sqrt(num)) {
                if (num % counter == 0) {
                    isNotPrime = true;
                    break;
                }
                counter++;
            }
        }

        if (isNotPrime) {
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + " is a prime number.");
        }
    }
}
