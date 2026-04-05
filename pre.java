import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class pre {

    public static void main(String[] args) {

        // Step 1: Create list
        List<Student> list = new ArrayList<>();

        // Step 2: Supplier using lambda (custom object creation)
        Supplier<Student> supplier1 = () -> new Student("Default", 0, false);

        // Step 3: Supplier using constructor reference (requires no-arg constructor)
        Supplier<Student> supplier2 = Student::new;

        // Step 4: Using suppliers
        Student s1 = supplier1.get();
        Student s2 = supplier1.get(); // new object again
        Student s3 = supplier2.get(); // default constructor

        // Step 5: Add to list
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // Step 6: Print all students
        System.out.println("All Students:");
        list.forEach(System.out::println);

        // Step 7: Check object identity
    }
}

// Student Class
class Student {
    private String name;
    private int marks;
    private boolean isActive;

    // No-arg constructor (needed for constructor reference)
    // ✅ No-arg constructor (for Supplier::new)
    public Student() {
        this.name = "Unknown";
        this.marks = 0;
        this.isActive = false;
    }

    // ✅ Parameterized constructor (for new Student("Ajay", ...))
    public Student(String name, int marks, boolean isActive) {
        this.name = name;
        this.marks = marks;
        this.isActive = isActive;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // toString
    @Override
    public String toString() {
        return String.valueOf(this.getMarks());
    }
}