package ArrayProblems;
public class FindSecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] nums = {3,6,2,66,3,6,74,4,45,2,3,68};

        int maxNum = nums[0];
        int secondMax = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(maxNum < nums[i]){
                secondMax = maxNum;
                maxNum = nums[i];
            }else if (nums[i] > secondMax && nums[i] != maxNum) {
                secondMax = nums[i];
            }
        }

        System.out.println("Max is "+ maxNum+ " \nsecondMax is "+ secondMax);
    }
}
