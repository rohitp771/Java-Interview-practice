package ArrayProblems;

import java.util.Arrays;

public class RemoveDuplicatesfromArrayStream {
    public static void main(String[] args){
        int[] nums = {1,4,7,3,7,0,3,5,8,5,1};
        System.out.println("Before duplicate removal "+ Arrays.toString(nums));
        
        int[] uniqueArray = Arrays.stream(nums).distinct().toArray();
        
        System.out.println("After duplicate removal "+ Arrays.toString(uniqueArray));
    }
}
