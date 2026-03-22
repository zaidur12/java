public class genmethod {
    public static void main(String[] args){
      printdata("hello");
      printdata(123);
      Strr("Hi");
     
    }
    static <E> void printdata( E data){
      System.out.println(data);
    }
     static <E extends  String> void Strr (E data){
        System.out.println(data);
    }
}
