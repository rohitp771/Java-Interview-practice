package ArrayProblems;
import java.util.ArrayList;
import java.util.List;

public class ReverseNumber {
    public static void main(String[] args) {
        int givenNumber = 1000;
        int reverseNumber=0;
        int temp = givenNumber;
        while (temp>0) { 
            reverseNumber = reverseNumber*10 + temp%10;
            temp = temp/10;
        }

        
        System.out.println("Reversed Number : "+ reverseNumber);

    }
}
