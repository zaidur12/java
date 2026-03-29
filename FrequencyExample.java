import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class FrequencyExample {
    public static void main(String[] args) {

        ArrayList<Integer> colours = new ArrayList<>();

        colours.add(1);
        colours.add(2);
        colours.add(1);
        colours.add(2);
        colours.add(2);

        // System.out.println("List of colours: " + colours);
        ListIterator<Integer> iterator = colours.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
       LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Toyota");
    
    LinkedList<String> valid = new LinkedList<String>();
    valid.add("Volvo");
    valid.add("Ford");
    valid.add("Mazda");
    
    cars.retainAll(valid);
    
    System.out.println(cars);

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer colour : colours) {
            frequencyMap.put(colour, frequencyMap.getOrDefault(colour, 0) + 1);
        }

        for (Integer colour : frequencyMap.keySet()) {
            System.out.println("Colour " + colour + " appears " + frequencyMap.get(colour) + " times");
        }

    }
}
