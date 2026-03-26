import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class employee {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
            String line;

            while ((line = reader.readLine()) != null) {

                System.err.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File error" + e.getMessage());
        }
    }


}