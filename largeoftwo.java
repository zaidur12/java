class Largest {
    public int num(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }
}

public class largeoftwo {
 public static void main(String[] args){
    Largest obj = new Largest();
    int result = obj.num(3,9);
    System.err.println(result);
 }
}
