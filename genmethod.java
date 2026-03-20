public class genmethod {
    public static void main(String[] args){
      printdata("hello");
      printdata(123);
    }
    static <E> void printdata( E data){
      System.out.println(data);
    }
}
