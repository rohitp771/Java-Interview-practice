public class CheckPalindromNumber {
    public static void main(String[] args) {
        int number = 112;
        int reversedNumber = 0;
        int temp = number;
        while(temp>0){
            reversedNumber = reversedNumber*10+temp%10;
            temp = temp/10;
        }

        if (number == reversedNumber) {
            System.out.println("Number is palindrom");
        }else{
            System.out.println("Number is not palindrom");
        }
    }
}
