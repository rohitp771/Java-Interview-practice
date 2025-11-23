public class SwapNumbersUsingXOR {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        
        System.out.print("Before Swap\n\n firstNumber : "+ firstNumber+"\nSecond Number : "+ secondNumber);

        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        System.out.print("\n\nAfter swap \n firstNumber : "+ firstNumber+"\nSecond Number : "+ secondNumber);

    }
}
