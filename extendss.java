class recordss <T extends Number & Comparable<T>>{
    private T id;
    private T phonenumber;
    private T marks;
    public T getMarks() {
        return marks;
    }
    public void setMarks(T marks) {
        this.marks = marks;
    }
    public T getId() {
        return id;
    }
    public void setId(T id) {
        this.id = id;
    }
    public T getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(T phonenumber) {
        this.phonenumber = phonenumber;
    }
    public int compare(T other){
        return marks.compareTo(other);
    }
}

public class extendss {
    public static void main(String[] args) {
    recordss<Integer> rec = new recordss<>();
    recordss<Long> rec1 = new recordss<>();
    recordss<Integer> a = new recordss<>();
recordss<Integer> b = new recordss<>();
a.setMarks(66);
b.setMarks(72);

int result = a.compare(b.getMarks()); // compares 66 vs 72

    rec.setId(12345);
    rec1.setId(123345567789L);
    rec.setMarks(66);
    rec1.setMarks(667L);

    System.out.println(result);
    }
}
