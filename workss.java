import java.util.Scanner;

public class workss{
    public static void main(String[] args){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter a day");
            String days = obj.nextLine();
            switch(days){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Workday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
            }
        }

    }
}
