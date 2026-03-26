import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyExample {
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");
        colours.add("Red");

        System.out.println("List of colours: " + colours);

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String colour : colours) {

            if (frequencyMap.containsKey(colour)) {
                int count = frequencyMap.get(colour);
                frequencyMap.put(colour, count + 1);
            } 
            else {
                frequencyMap.put(colour, 1);
            }
        }

        System.out.println("Frequency of colours: " + frequencyMap);
    }
}