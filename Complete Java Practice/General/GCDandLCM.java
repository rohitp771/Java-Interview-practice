public class GCDandLCM {

    public static int findGCD(int num1,int num2){
        while(num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }

    public static int findLCM(int num1,int num2){
        int lcmNum = (num1*num2)/findGCD(num1, num2);
        return lcmNum;
    }

    public static void main(String[] args) {
        int num1 = 273;
        int num2 = 561;

        int gcdNumber = findGCD(num1,num2);
        int lcmNumber = findLCM(num1,num2);
        System.out.println("GCD of two numbers is "+ gcdNumber);
        System.out.println("LCM of two numbers is "+ lcmNumber);


    }
}
