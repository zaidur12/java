
import java.util.ArrayDeque;
import java.util.Deque;

public class dequee{
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>(2);
        Deque<Integer> list1 = new ArrayDeque<>(2);

        list.addFirst(4);
        list.addLast(9);
        list.addFirst(5);
         list.addFirst(3);

        list1.offerFirst(8);
        list1.offerLast(6);
        list1.offerFirst(8);
        list1.offerLast(6);

        System.out.println(list);
        System.out.println(list1);
    }
}