import java.util.Arrays;
import java.util.List;

public class IterateListUsingLambda {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,4,6,8,3,6,8,33);

        myList.forEach(element -> System.out.println(element));
        
    }
}
