import java.lang.reflect.Method;

class Animallll {
    public void display(){
        System.out.println("Hi");
    }
}
class Dogg extends  Animallll{
    public void makesound(){
        System.out.println("Bark");
    }
     public void makenoise(){
        System.out.println("Bark");
    }
}
public class reflectionn {
    public static void main(String[] args) {
        Animallll dog = new Dogg();
        dog.display();
        Class<?> object = Animallll.class;
        System.out.println(object.getName());
        Method[] m = object.getDeclaredMethods();

        for (Method method: m){
            System.out.println(method.getName());
        }
        
    }
}
