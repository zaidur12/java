record Person(int age ,String name){

    public Person {
        if(age == 0)
            throw new IllegalArgumentException("age cannnot be Zero");
      
    }
    

 }
public class rec {
    public static void main(String[] args) {
       Person p1 = new Person(11, "hello");
       Person p2 = new Person(0,"hi");
       System.out.println(p2.age() + p2.name()); 
    }
}
