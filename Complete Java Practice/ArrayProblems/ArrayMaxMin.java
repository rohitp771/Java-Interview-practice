package ArrayProblems;
public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] nums = {3,6,2,66,3,6,74,4,45,2,3,};

        int maxNum = nums[0];
        int minNum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(maxNum < nums[i]){
                maxNum = nums[i];
            }else{
                minNum = nums[i];
            }
        }

        System.out.println("Max is "+ maxNum+ " Min num is "+ minNum);
    }
}
