package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapUsingLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>(Map.of(
            "First",1,
            "Third", 3,
            "Second", 2
            
        ));

        List<Map.Entry<String,Integer>> myList = new ArrayList<>(myMap.entrySet());
        myList.sort(Map.Entry.comparingByValue());

         Map<String,Integer> myLinkedMap = new LinkedHashMap<>();
        
    }
}
