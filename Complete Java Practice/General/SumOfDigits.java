public class SumOfDigits {
    public static void main(String[] args) {
        int num = 888;
        int temp = num;
        int sum = 0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of digits in "+num+" is "+sum);
    }
}
