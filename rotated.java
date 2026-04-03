import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rotated {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 1, 5, 6));
        int k = 2;
        k = k % list.size();

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(k, list.size()));
        rotatedList.addAll(list.subList(0, k));

        System.out.println(rotatedList);
    }
}
