package ArrayProblems;
public class LargestAndSmallest {
    public static void main(String[] args) {
        int a = 10, b =20, c = 30;

        int largest = Math.max(a,Math.max(b,c));
        int smallest = Math.min(a,Math.min(b,c));

        System.out.println("Largest : "+largest+ "\nSmallest :"+ smallest);
    }
}
