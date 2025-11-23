package Collection;

import com.sun.source.tree.Tree;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortHashMapUsingTreeMap {
    public static void main(String[] args){
        Map<String,Integer> myMap = new HashMap<>(Map.of(
            "a",1,
            "c", 3,
            "b", 2
            
        ));

        Map<String,Integer> sortedMap = new TreeMap<>(myMap);
        System.err.println(sortedMap.values().toString());
    }
}
