public class container {
    public static void main(String[] args) {
        Contain<String> d1 = new Contain<>("Hello");
        System.out.println(d1.getvalue());

    }
}

class Contain<T> {
    T value;

    public Contain(T value) {
        this.value = value;
    }

    T getvalue() {
        return value;

    }
}