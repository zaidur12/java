
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class streammmmm {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 7, 9, 32, 6, 9,36,8,32,80);
        List<Integer> fList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
       System.out.println(fList);
       List<Integer> nlist = fList.stream()
       .map(x -> x*2)
       .distinct()
       .sorted((a,b)->(b-a))
       .limit(3)
       .skip(1)
       .collect(Collectors.toList());
       System.out.println(nlist);
       List<Integer> col = Stream.iterate(0, x -> x + 2).limit(51).collect(Collectors.toList());
       System.out.println(col);

    }
}
