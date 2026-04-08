class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class GenericStudent<K,V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class genn {
    public static void main(String[] args) {
        // Box can hold one type at a time.
        Box<Integer> numberBox = new Box<>();
        numberBox.setValue(12);

        Box<String> colorBox = new Box<>();
        colorBox.setValue("Yellow");

        System.out.println("Integer box value: " + numberBox.getValue());
        System.out.println("String box value: " + colorBox.getValue());

        // Student uses two generic types: one for key and one for value.
        GenericStudent<String,Integer> student1 = new GenericStudent<>();
        GenericStudent<Integer,Integer> student2 = new GenericStudent<>();

        student1.setKey("heloo");
        student1.setValue(23);

        student2.setKey(678);
        student2.setValue(14);

        System.out.println("Student 1 -> Key: " + student1.getKey() + ", Value: " + student1.getValue());
        System.out.println("Student 2 -> Key: " + student2.getKey() + ", Value: " + student2.getValue());
    }
}
