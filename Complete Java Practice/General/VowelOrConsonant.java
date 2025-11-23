import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      char ch = scanner.next().charAt(0);
      List<Character> vowelList = List.of('a', 'e', 'i','o','u'); // Example list

      if(vowelList.contains(ch)){
        System.out.println("Its a vowel");
      }else{
        System.out.println("Its a consonant");
      }

    }
}
