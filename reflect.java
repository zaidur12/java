
import java.lang.reflect.Method;

class Arithmetic {
   
    void arthemretic(){

    };
}
class Adder extends Arithmetic{
    public int add(int a, int b)
    {
       
       return a+b;
    }
     public int sub(int a, int b)
    {
       
       return a-b;
    }
}
public class reflect {
    public static void main(String[] args) {
      Adder adder = new Adder();
      Class<?> obj = adder.getClass();
      Method [] m = obj.getDeclaredMethods();
      for(Method method : m){
        System.out.println(method.getName());
      }
      System.out.println(obj.getName());
      System.err.println(adder.add(10,32)+adder.add(10,3)+ adder.add(10,10));  
    }
}


