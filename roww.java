import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class roww {
    public static void main(String[] args) {
        
    
    ArrayList<List<Integer>> row = new ArrayList<>();
    row.ensureCapacity(10);
    List<Integer> row1 = Arrays.asList(1,2,3);
    List<Integer> row2 = Arrays.asList(1,2,3);
    List<Integer> row3 = Arrays.asList(1,2,3);
    List<Integer> row4 = Arrays.asList(1,2,3);
    List<Integer> row5 = Arrays.asList(1,2,3);
    List<Integer> row6 = Arrays.asList(1,2,3);
    List<Integer> row7 = Arrays.asList(1,2,3);
    List<Integer> row8 = Arrays.asList(1,2,3);

    row.add(row1);
    row.add(row8);
    row.add(row5);
    System.out.println(row);
    }

}
