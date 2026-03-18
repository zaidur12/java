import java.util.ArrayList;

public class aaraylist {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Alex");
        student.add("Blake");
        student.add("Camroon");
        student.add("Derek");
        student.add("Even");

        student.add(1,"ZR");
         ArrayList<String> student1 = new ArrayList<>();
        student1.add("Alex");
        student1.add("Blake");
        student1.add("Camroon");
        student1.add("Derek");
        student1.add("Even");

        student.add(1,"ZR");

        System.out.println(student);

    }
}