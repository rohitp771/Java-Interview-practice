package StringProblems;

public class PalindromString {
    public static void main(String[] args) {
        String name = "sososos";
        int  i = 0;
        int j = name.length()-1;
        boolean isPalindrom = true;
        if(name.length()%2 == 0){
            isPalindrom = false;
        }else{
            while (i<j) { 
                if(name.charAt(i) != name.charAt(j)){
                    isPalindrom = false;
                    break;
                }
                i++;j--;
            }
        }

        if(isPalindrom) System.out.println("Palindrom");
        else System.out.println("Not palindrom");
    }
}
