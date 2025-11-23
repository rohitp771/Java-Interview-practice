package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(4,6,8,3,6,4,2,7,8,3,57));
        Map<Integer,Integer> myMap = new HashMap<>();
        
        for(Integer num : myList){
            if(myMap.containsKey(num)){
                myMap.put(num, myMap.get(num) + 1);
            }else{
                myMap.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> en : myMap.entrySet()){
            if(en.getValue() > 1){
                System.out.println("Duplicate number : "+ en.getKey());
            }
        }
    }
}
