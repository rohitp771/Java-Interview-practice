package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetViceVersa {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,5,3,6,3,6,2,57,3);
         System.out.println("Current List : "+myList.toString());
        Set<Integer>  mySet = myList.stream().collect(Collectors.toSet());
        
        System.out.println("List to set : "+mySet.toString());
        
        System.out.println("----------------------");
        List<Integer> newList = mySet.stream().collect(Collectors.toList());
        System.out.println("Back to List" + newList.toString());
    }
}