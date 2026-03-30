import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class srtudent {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Maths", 98);
        students.put("English", 67);
        students.put("Science", 78);

        System.out.println(students);

        int highestMark = Collections.max(students.values());
        System.out.println("Highest mark: " + highestMark);
        
        int lowestMark=Collections.min(students.values());
                
        System.out.println("Lowest mark: " + lowestMark);


        System.out.println("Top subject(s):");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
           if (entry.getValue() == highestMark || entry.getValue() == lowestMark) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

        }
    }
}
