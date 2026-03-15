import java.util.Scanner;

class Greeter {
    public String name(Scanner scanner) {
        return scanner.nextLine();
    }
}

public class Hello {
    public static void main(String[] args) {
        Greeter obj = new Greeter();
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = obj.name(scanner);
        System.out.println("Hello " + name);
        scanner.close();
    }
}
