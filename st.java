import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Stream;

public class st {
     public static void main(String[] args) throws Exception {

        URL url = new URL("https://jsonplaceholder.typicode.com/users");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream()));

        StringBuilder data = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            data.append(line);
        }

        System.out.println(data.toString()); 
        
       
    }
}
