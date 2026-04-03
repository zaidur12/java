import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class arrayy {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(7);
        num.add(9);

        num.remove(1);
        System.out.println(num);

        List<Integer> newarr = new ArrayList<>();
        for(Integer i : num){
          if(!newarr.contains(i)){
            newarr.add(i);
          }
        }

    
        System.out.println(newarr);
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(8);
        list.remove(1);
        System.out.println(list);

        LinkedList<Integer> newlist = new LinkedList<>();
        newlist.addLast(9);
        newlist.addLast(9);
        newlist.addLast(7);

        System.out.println(newlist.peek());
        System.out.println(newlist.removeLast());
        
    //    Map<Integer, Integer> dup = new HashMap<>();
    //    for(Integer i: num){
    //     dup.put( i,dup.getOrDefault(i, 0));
    //    }
    //    System.out.println(dup.values());
       
        // Iterator<Integer> it = num.iterator();
        // while (it.hasNext()) {
        //     int value = it.next();
        //     it.remove();
        // }
        // System.out.println(num);
    }
}