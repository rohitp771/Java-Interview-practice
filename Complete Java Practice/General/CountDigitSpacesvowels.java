import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class CountDigitSpacesvowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myDataString = scanner.nextLine();
        List<Character> vowelList = List.of('a', 'e', 'i','o','u'); // Example list

        char[] allChars = myDataString.toCharArray();
        int spaceCount = 0;
        int vowelCount = 0;
        int digitCount = 0;
        for(char currentChar : allChars){
            if(Character.isSpaceChar(currentChar))spaceCount++;
            else if(vowelList.contains(currentChar)) vowelCount++;
            else if(Character.isDigit(currentChar)) digitCount++;
        }

        System.out.println("Digits "+digitCount);
        System.out.println("Spaces "+spaceCount);
        System.out.println("Vowels "+vowelCount);
    }
}
