interface A{
    int  print(int i,int j);
}
public class Mainn {
    public static void main(String[] args) {

       A obj = (i,j) -> i+j;
       int res =  obj.print(3,4);
       System.out.println(res);
     

       
    }
}