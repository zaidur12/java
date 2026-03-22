import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args){
        Consumer<Integer> display = x -> System.out.println(x);
        display.accept(100);
    }
}
