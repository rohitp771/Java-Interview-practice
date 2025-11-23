package StringProblems;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Rohit Ramesh Pawar";
        StringBuilder sb = new StringBuilder();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        for (char ch : set) {
            sb.append(ch);
        }

        System.out.println(sb.toString()); // Output: "progamin"
        
       
    }
}
