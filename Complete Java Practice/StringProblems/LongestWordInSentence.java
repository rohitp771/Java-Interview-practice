package StringProblems;

import java.util.Arrays;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "My name is Rohit Ramesh Pawar";
        String[] allwords = sentence.split(" ");
        System.out.println(Arrays.toString(allwords));
        String longestWord = "";
        for (String elem : allwords) {
            if(elem.length() > longestWord.length())
                longestWord = elem;
        }

        System.out.println("Longest word : " + longestWord);
    }
}
