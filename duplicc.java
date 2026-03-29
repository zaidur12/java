import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicc {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(1);

        System.out.println(list);

        Set<Integer> freq = new HashSet<>();
for (Integer i : list) {
    if (freq.contains(i)) {
        System.out.println(i + " duplicate");
    } else {
        freq.add(i);
    }
}

    }
}
