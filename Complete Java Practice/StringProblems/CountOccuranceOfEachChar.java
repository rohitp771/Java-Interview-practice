package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachChar {
    public static void main(String[] args) {
         String s1 = "AA AA aa AA aa b";

         HashMap<Character,Integer> occurances = new HashMap<>();

         for (char nameChar : s1.toCharArray()) {
            if(occurances.containsKey(nameChar)){
                occurances.replace(nameChar, occurances.get(nameChar)+1);
            }else{
                occurances.put(nameChar,1);
            }
         }
         for (Map.Entry<Character, Integer> entry : occurances.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
