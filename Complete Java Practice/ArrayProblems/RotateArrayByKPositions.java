package ArrayProblems;
import java.util.Arrays;

public class RotateArrayByKPositions {
    public static void main(String[] args) {
         int[] arrayToRotate = {1, 3, 5, 7, 9 , 11, 13,15,17 };
         int k =3;
         int arrayLength = arrayToRotate.length;
         int[] tempArray = new int[arrayLength];
         k = k%arrayLength;

         for(int i=0;i<arrayLength;i++){
            tempArray[(i+k)%arrayLength] = arrayToRotate[i];
         }

         for (int i = 0; i < arrayLength; i++) {
            arrayToRotate[i] = tempArray[i];
            }

            System.out.println(Arrays.toString(arrayToRotate));
         
    }
}
