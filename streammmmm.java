
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class streammmmm {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 7, 9, 32, 6, 9);
        List<Integer> fList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> fList1 = list.stream().map(x -> x * 2).collect(Collectors.toList());
        List<List<Integer>> nested = List.of(
                List.of(1, 2),
                List.of(3, 4));

        List<Integer> flat = nested.stream()
                .flatMap(l -> l.stream())
                .toList();

        System.out.println(flat); // [1, 2, 3, 4]

        System.out.println(fList);
        System.out.println(fList1);

    }
}
