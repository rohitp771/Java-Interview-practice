package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicatesInListUsingStream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,7,3,5,7,9,4,2,5,7,9,3);
        
        Set<Integer> duplicates = myList.stream()
            .filter(i-> Collections.frequency(myList, i)>1)
            .collect(Collectors.toSet());

        System.out.println(duplicates.toString());
    }
}
