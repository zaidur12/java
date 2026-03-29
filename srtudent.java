import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class srtudent {
    public static void main(String[] args) {
        
        Map<String,Integer> students= new HashMap<>();
        students.put("Maths", 98);
        students.put("English", 98);
        students.put("Science",78);

        System.out.println(students);
        System.out.println(Collections.max(students.values()));

    }
}
