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
        student1.add("Al");
        student1.add("Bl");
        student1.add("Cam");
        student1.add("Der");
        student1.add("Eve");

        student.add(1,"ZR");

        student.addAll(student1);

        System.out.println(student);

    }
}