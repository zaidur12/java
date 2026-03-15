import java.util.Scanner;

class AsciiHelper {
    public int asciiValue(Scanner scanner) {
        String input = scanner.nextLine();
        char ch = input.charAt(0);
        return (int) ch;
    }
}
public class asciii {
    public static void main(String[] args) {
        AsciiHelper obj = new AsciiHelper();
        System.out.println("Enter the character");
        Scanner scanner = new Scanner(System.in);
        int ascii = obj.asciiValue(scanner);
        System.out.println(ascii);
        scanner.close();
    }
}
