package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,5,3,6,3,6,2,57,3);

        List<Integer> uniqueList = myList.stream()
        .distinct()
        .collect(Collectors.toList());

        System.out.println(uniqueList.toString());

    }
}
