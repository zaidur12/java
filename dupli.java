import java.util.ArrayList;
import java.util.HashSet;

public class dupli{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        HashSet<Integer> freq = new HashSet<Integer>();

        num.add(1);
        num.add(2);
        num.add(4);
        num.add(2);
        num.add(1);

        for(int i = 0; i < num.size(); i++){
            if(freq.contains(num.get(i))){
                System.out.println(num.get(i));
            } else {
                freq.add(num.get(i));
            }
        }
    }
}

