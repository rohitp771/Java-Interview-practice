package ArrayProblems;

import java.util.Arrays;

public class CheckIfArraySorted {
    public static void main(String[] args) {
         Integer[] nums = {9,8,7,6,5,4,3,3,1};
         boolean isSorted = true;
         System.out.println("before sort "+Arrays.toString(nums));
         Arrays.sort(nums);
         System.out.println("After sort "+Arrays.toString(nums));

         Integer currentMax = nums[0];
         for(Integer num : nums){
            if(num < currentMax){
                isSorted = false;
                break;
            }
         }
         System.out.println("Is sorted : "+ isSorted);
    }
}
