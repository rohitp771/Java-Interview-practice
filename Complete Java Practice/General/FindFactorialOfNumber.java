public class FindFactorialOfNumber {

    public static int factorial(int number){
        if(number != 1){
            return number*factorial(number-1);
        }
        return number;     
    }


    public static void main(String[] args) {
        int num = 5;
        int fact = factorial(num);
        System.out.println(fact);
    }
}
