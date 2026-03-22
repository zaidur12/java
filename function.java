import java.util.function.Function;

public class function {
    public static void main(String[] args){
        Function<Integer,Integer> doub = x -> x*2;
        System.out.println(doub.apply(100));
    }
}
