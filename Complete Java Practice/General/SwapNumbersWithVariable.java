public class SwapNumbersWithVariable {
    public static void main(String[] args){
        int firstNumber = 10;
        int secondNumber = 20;

        
        int thirdVariable;
        System.out.print("Before Swap\n\n firstNumber : "+ firstNumber+"\nSecond Number : "+ secondNumber);

        thirdVariable = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdVariable;

        System.out.print("\n\nAfter swap \n firstNumber : "+ firstNumber+"\nSecond Number : "+ secondNumber);


        
    }
}
