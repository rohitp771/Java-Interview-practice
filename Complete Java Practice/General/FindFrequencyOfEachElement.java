
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfEachElement {
    public static void main(String[] args) {
         int[] nums = {1,2,3,4,1,3,9,3};

         Map<Integer,Integer> frequeMap = new HashMap<>();

         for (int i : nums) {
            if(frequeMap.containsKey(i)){
                frequeMap.replace(i, frequeMap.get(i)+1);
            }else{
                frequeMap.put(i, 1);
            }
         }

         frequeMap.forEach((key, value) ->System.out.println(key + "  ->  " + value));


         
    }
}
