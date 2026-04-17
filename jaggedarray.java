
import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args){
       int num[][] = new int[5][];
       num[0] = new int[5];
       num[1] = new int[1];
       num[2] = new int[4];
       num[3] = new int[0];
       num[4] = new int[3];

       for(int i= 0;i<num.length;i++){
        for(int j = 0;j<num[i].length;j++){
           num[i][j] = (int)(Math.random()*10);
           System.out.print(num[i][j]);
        }
        System.out.println();

        }
       
    }
}
