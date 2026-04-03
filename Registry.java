import java.util.*;

class Student {
    private String id;
    private String name;
    private int marks;

    public Student(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Registry {
    public static void addStudent(Set<String> stuid, List<Student> record, String id, String name, int marks) {
        if (stuid.contains(id)) {
            System.out.println("ID already exists: " + id + " " + name);
            return;
        }
        record.add(new Student(id, name, marks));
        stuid.add(id);
    }

    public static void main(String[] args) {

        Set<String> stuid = new HashSet<>();
        List<Student> record = new ArrayList<>();

        addStudent(stuid, record, "MCA001", "Zaidur", 79);
        addStudent(stuid, record, "MCA002", "Naba", 67);
        addStudent(stuid, record, "MCA003", "JB", 90);
        addStudent(stuid, record, "MCA004", "Rupal", 78);

        for (Student student : record) {
            System.out.println(
                    "Name:- " + student.getName() +
                            " ID:- " + student.getId() +
                            " Mark:- " + student.getMarks());

        }
        Collections.sort(record, (m1, m2) -> Integer.compare(m2.getMarks(), m1.getMarks()));
        for (int i = 0; i < 3;i++){
          System.out.println(record.get(i).getName() +" -> " + record.get(i).getMarks());
        }

        

        for (Student student : record) {
            if (student.getMarks() > 40) {
                System.out.println(
                        "Name:- " + student.getName() + " is pass");
            } else {
                System.out.println(
                        "Name:- " + student.getName() + " is fail");
            }

        }
        int sum = 0;
        int count = 0;
          for (Student student : record) {
            sum += student.getMarks();
            count++;
            
        }
        System.out.println(sum/count);

    }

}
