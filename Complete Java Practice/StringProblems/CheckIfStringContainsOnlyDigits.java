package StringProblems;

public class CheckIfStringContainsOnlyDigits {

    public static void main(String[] args) {
         String name = "14A6843";
         char[] nameChars = name.toCharArray();
         boolean allDigits = true;
         for(char ch : nameChars){
            if(!Character.isDigit(ch)){
                allDigits = false;
                break;
            }
         }

         if(allDigits) System.out.println("All Digits");
         else System.out.println("NOT ALL DIGITS");
         
    }
}