package ArrayProblems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numArray = {4,7,2,8,5,4,73,3,82,44,73};
        System.out.println("Original Array "+Arrays.toString(numArray));
        Set<Integer> uniqArrayElements = new LinkedHashSet<>();
        for (int num : numArray) {
            uniqArrayElements.add(num);
        }

        System.out.println("Final Array "+Arrays.toString(uniqArrayElements.toArray()));
    }
}
