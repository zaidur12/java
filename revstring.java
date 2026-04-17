
import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            String str = sc.next();
            int len = str.length();
            String rev = "";

            for(int i = len-1;i>=0;i--){
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);
            if(str.equalsIgnoreCase(rev)){
                System.out.println("true");
            }
            else{

                System.out.println("false");
            }
        }
    }
}
