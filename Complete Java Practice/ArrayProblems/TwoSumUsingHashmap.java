package ArrayProblems;

import java.util.HashMap;

public class TwoSumUsingHashmap {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,9,11,12,14,22,34,56};
        int target = 14;

        HashMap<Integer,Integer> numberToIndex = new HashMap<>();

        for(int i = 0;i<nums.length-1;i++){
            if(numberToIndex.containsKey(target-nums[i])){
                System.out.println("Pair index ("+i+" , "+numberToIndex.get(target-nums[i])+")");
            }
            numberToIndex.put(nums[i], i);
        }
    }
}
