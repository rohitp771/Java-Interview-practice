package StringProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckIfStringsAnagrams {
    public static void main(String[] args) {
        String s1 = "Rohit";
        String s2 = "hitRo";

        if (s1.length() != s2.length()) {
            System.out.println("NOT Anagrams");
        }else{
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if(Arrays.equals(s1Array, s2Array))
                System.out.println(" ---- Anagrams");

        }

    }
}
