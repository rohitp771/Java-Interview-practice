package ArrayProblems;
public class twoSumProblem {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,9,11,12,14,22,34,56};
        int target = 14;
        for(int i =0;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length-1;j++){
                if (nums[i] + nums[j] == target) {
                    System.out.println("Index = "+i +" , "+ j);
                }
            }
        }
    }
}
