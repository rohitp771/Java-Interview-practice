package StringProblems;

public class FindAllSubString {
    public static void main(String[] args) {
        String oneString = "RohitPawar";
        
        for(int i = 0;i<oneString.length();i++){
            for(int j=i+1;j<=oneString.length();j++){
                System.out.println("substring : "+ oneString.substring(i,j));
            }
        }
    }
}
