import java.util.function.Predicate;
public class predicate {
    public static void main(String[] args)
    {
    
    Predicate<Integer> isEven = x -> x%2==0;
    System.out.println(isEven.test(4));
    Predicate<String> word = x -> x.startsWith(("A"));
    Predicate<String> end = x -> x.endsWith("t");
    Predicate<String> and = word.and(end);
    System.out.println(and.test("Ankit"));
    }
}

