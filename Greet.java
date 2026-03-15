import java.util.Scanner;
class greet {
    public String name() {
        String username = " ";
        try (Scanner obj = new Scanner(System.in)) {
            username = obj.nextLine();
        }
        return username;
    }
 }
public class Greet{
    public static void main(String[] args) {
        greet obj = new greet();
        String name = obj.name();
        System.out.println("Hello " + name);
    }
 }
