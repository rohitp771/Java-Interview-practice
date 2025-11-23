package ArrayProblems;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numArray = {4,7,2,8,5,3,82,44,73};
         System.out.println("before Reverse "+Arrays.toString(numArray));
        for(int i=0;i<numArray.length/2;i++){
            int temp;
            temp = numArray[i];
            numArray[i]=numArray[numArray.length-(i+1)];
            numArray[numArray.length-(i+1)] = temp;
        }

        System.out.println("After Reverse "+Arrays.toString(numArray));
    }
}
