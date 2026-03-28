
public class Single {
    public static void main(String[] args) {
        a obj1 = a.getInstance();
        a obj2  = a.getInstance();

    }
}
class a{
  static a obj = new a();
  private a (){
      System.out.println("Object is create");
  }
  public static a getInstance(){
    return obj;
  }
}