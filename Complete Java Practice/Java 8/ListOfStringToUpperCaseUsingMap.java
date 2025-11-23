import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToUpperCaseUsingMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "avocado");
        List<String> upperCaseWords = words.stream()
                            .map(element-> element.toUpperCase())
                            .collect(Collectors.toList());
        System.out.println(upperCaseWords);
                    
    }
}
