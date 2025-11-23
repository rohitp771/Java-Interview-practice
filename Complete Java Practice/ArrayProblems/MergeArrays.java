package ArrayProblems;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8,10,12,14,16};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 (if any)
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 (if any)
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
