package StringProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "Rohit PawaR";
      
        Map<Character,Integer> charToOccuranceCount = new LinkedHashMap<>();
        for (char ch : name.toCharArray()) {
            charToOccuranceCount.put(ch, charToOccuranceCount.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> en : charToOccuranceCount.entrySet()){
            if(en.getValue() == 1 ){
                  System.out.println("First non-repeated character: " + en.getKey());
                break;
            }
        }


        
    }
}
