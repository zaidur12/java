import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoaaray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>( Arrays.asList(1, 5, 7, 8));
        List<Integer> list2 = new ArrayList<> (Arrays.asList(1, 5, 7, 8));
        list1.addAll(list2);
        System.out.println(list1);
    }
}
