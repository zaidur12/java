import java.util.LinkedHashMap;
import java.util.Map;

public class lru {
   public static void main(String[] args) {
    LinkedHashMap<Integer,String> list = new LinkedHashMap<>(5);
    list.put(1,"Mango");
    list.put(2,"Banana");
    list.put(3,"Orange");
    list.put(4, "Papaya");
    list.put(5, "Gauva");
    
   
    

    for(Map.Entry<Integer,String> entry : list.entrySet()){
        System.out.println(entry.getKey());
    }
   } 
}
