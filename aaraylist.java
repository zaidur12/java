import java.util.*;


public class aaraylist {
    public static void main(String[] args) {
        // ArrayList<String> student = new ArrayList<>();
        // student.add("Alex");
        // student.add("Blake");
        // student.add("Camroon");
        // student.add("Derek");
        // student.add("Even");
        
        // Collections.max(student);
        // System.out.println(student);


        // Collections.sort(student,Collections.reverseOrder());
        // System.out.println(student);

        // for(int i=student.size()-1;i>=0;i--){

        //     System.out.print("["+" "+student.get(i)+" "+"]");
        // }

        // // for( String stud: student){
        // //     System.out.println(stud);

        // // }
        
        

        //  ArrayList<Integer> student1 = new ArrayList<>();
        // student1.add(1);
        // student1.add(12);
        // student1.add(9);
        // student1.add(5);
        // student1.add(3);
       
        // // Collections.max(student1);
        // System.out.println(Collections.max(student1));
        //         System.out.println(Collections.min(student1));



        // // student.addAll(student1);
        // // student.set(0, "tina");


        // // System.out.println(student);

        // // Iterator<String> i = student.iterator();
        // // while (i.hasNext()) {
        // //    System.err.println(i.next()); 
        // }


 HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    System.out.println(capitalCities.entrySet());
  }
    }
