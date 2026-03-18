import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<Integer> number = new Stack<>();
        number.push(9);
        number.push(8);


        System.err.println(number.peek());
    }
}
