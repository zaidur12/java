import java.util.ArrayList;
import java.util.Iterator;

public class aaraylist {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Alex");
        student.add("Blake");
        student.add("Camroon");
        student.add("Derek");
        student.add("Even");

         ArrayList<String> student1 = new ArrayList<>();
        student1.add("Al");
        student1.add("Bl");
        student1.add("Cam");
        student1.add("Der");
        student1.add("Eve");



        student.addAll(student1);
        student.set(0, "tina");


        System.out.println(student);

        Iterator<String> i = student.iterator();
        while (i.hasNext()) {
           System.err.println(i.next()); 
        }



    }
}