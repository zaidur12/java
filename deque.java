import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args){
        ArrayDeque<Integer> a = new ArrayDeque<Integer>();
        a.addFirst(6);
        a.addLast(8);
        a.addFirst(4);

        System.out.println(a);
    }
}
