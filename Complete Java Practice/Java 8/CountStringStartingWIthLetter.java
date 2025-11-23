import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringStartingWIthLetter {
    public static void main(String[] args) {
         List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "avocado");
        char letter = 'b';

        List<String> myString2 = words.stream().
                        filter(word -> word.startsWith(String.valueOf(letter)))
                        .collect(Collectors.toList());
        System.out.println(myString2.size());
    }
}
