class Fiba{
    public int fiba(int n){
     if (n == 0) {
        return 0;
     }
     if (n == 1) {
        return 1;
     }

     int first = 0;
     int second = 1;
     int cur = 0;
     for(int i = 2; i <= n; i++){
        cur = first + second;
        first = second;
        second = cur;
    }
     return cur;
        
    }

}
public class fib {
    public static void main(String[] args){
        Fiba obj = new Fiba();
        int series = obj.fiba(7);
        System.out.println(series);
    }
}
