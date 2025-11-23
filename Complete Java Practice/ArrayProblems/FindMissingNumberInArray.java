package ArrayProblems;
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,8,9,10,11,12};
        int missingNumber = 0;

        for(int i=0;i<nums.length-1;i++){
            if((nums[i+1] - nums[i])!= 1){
                missingNumber = nums[i]+1;
                break;
            }
                 
        }
        System.out.println("Missing number = "+ missingNumber);
    }
}
