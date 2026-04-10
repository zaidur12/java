import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lengthh {

    public static void main(String[] args)
     {
        Comparator<String> com = (String str1, String str2) ->  str1.length() > str2.length() ? 1 : -1;
    

        
        List<String> str  = new ArrayList<>();
        str.add("hello");
        str.add("van");
        str.add("ven");
        str.add("love");
        str.add("on");

       Collections.sort(str,com);
       System.out.println(str);


    }
}
