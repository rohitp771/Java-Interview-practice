package StringProblems;

public class CountWordsInString {
    public static void main(String[] args) {
         String sentence = "My name is Rohit Ramesh Pawar";
         String[] words = sentence.split("\\s+");
         System.out.println("Number of words : "+ words.length);
    }
}
