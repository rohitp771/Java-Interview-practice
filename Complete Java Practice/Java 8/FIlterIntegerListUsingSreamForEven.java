import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIlterIntegerListUsingSreamForEven {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,4,6,8,3,6,8,33);

        List<Integer> evens = myList.stream()
                .filter(element-> element%2 == 0)
                .collect(Collectors.toList());

        System.out.println(evens);
    }
}
