import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollecInListMapSet {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "avocado","apricot");
        Set<String> myStrings = words.stream().collect(Collectors.toSet());
        System.out.println(myStrings);

        List<String> myStrings2 = words.stream().collect(Collectors.toList());
        System.out.println(myStrings2);

         Map<String, Integer> mapResult = words.stream()
                                             .distinct() // avoid duplicate keys
                                             .collect(Collectors.toMap(
                                                 word -> word,       // key
                                                 word -> word.length() // value
                                             ));
        System.out.println("Map: " + mapResult);
    }
}
