import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.print.DocFlavor.INPUT_STREAM;

public class funnnn {public static void main(String[] args) {
    

    Function<Integer,Integer> fun1 = x-> x+10;
    Function<Integer,Integer> fun2 = x -> x*x*x;
    System.out.println(fun1.andThen(fun2).apply(2));
    System.out.println(fun1.compose(fun2).apply(2));

    Function<String,String> namee = s-> s.substring(0,3);
    Function<List<Student>,List<Student>>  preefix = li -> {
        List<Student> list = new ArrayList<>();
          for(Student s : li){
            if(namee.apply(s.getName()).equalsIgnoreCase("Vip")){
               list.add(s);
            }
        }
        return list;
    };
    Student s1 = new Student(1,"Vipul");
    Student s2 = new Student(2 ,"Vipam");
    Student s3 = new Student(3,"Arun");

   List<Student> students = Arrays.asList(s1,s2,s3);
   List<Student> filters = preefix.apply(students);
   System.out.println(filters);
    
}
private static class Student{
private int id;
private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
}


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
}