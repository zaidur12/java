import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    
    static  boolean anagramic(String strone, String strtwo){
        strone = strone.toLowerCase().replaceAll("\\s", "");
        strtwo = strtwo.toLowerCase().replaceAll("\\s", "");
    
      if (strone.length() != strtwo.length()) {
            return false;
        }

        char[] str1 = strone.toCharArray();
        char[] str2 = strtwo.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
    public static  void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String str1 = sc.next();
            String str2 = sc.next();

            boolean check = anagramic(str1, str2);
            System.out.println(check);
        }
    }
}
