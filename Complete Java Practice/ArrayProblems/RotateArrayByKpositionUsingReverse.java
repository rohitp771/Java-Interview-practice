package ArrayProblems;
import java.util.Arrays;

public class RotateArrayByKpositionUsingReverse {

    public static void reverse (int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
         int[] arrayToRotate = {1, 3, 5, 7, 9 , 11, 13,15,17 };
         int k = 3;
         k = k%arrayToRotate.length;
         reverse(arrayToRotate,0,arrayToRotate.length-1);
         reverse(arrayToRotate,0,k-1);
         reverse(arrayToRotate,k,arrayToRotate.length-1);

         System.out.println("Rotated array : "+ Arrays.toString(arrayToRotate));
    }
}
