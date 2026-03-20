public class gen {
    public static void main(String[] args){
        Dog<String> d1 = new Dog<>("we123");
        Dog<Integer> d2 = new Dog<>(123);
        System.out.println(d1.id);
        System.out.println(d2.id);
    }
}
class Dog<E> {
E  id;
public Dog(E id){
    this.id = id;
}
}