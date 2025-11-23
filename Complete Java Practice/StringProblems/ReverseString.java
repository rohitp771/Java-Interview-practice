package StringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Rohit";
        String reversedString = "";

        for(int i = name.length()-1;i>=0;i--){
            reversedString+= name.charAt(i);
        }

        System.out.println("Reversed String = "+ reversedString);
    }

    public static String reverseUsingArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
