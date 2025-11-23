import java.util.Arrays;
import java.util.List;

public class FindMaxMinUsingStream {
    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(111,52,7,4,7,3);
        int max = myNumbers.stream().mapToInt(n->n).max().orElseThrow();
        int min = myNumbers.stream().mapToInt(n->n).min().orElseThrow();
        int sum = myNumbers.stream().mapToInt(n->n).sum();
         System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
    }
}
