
public class Single {
    public static void main(String[] args) {
        a obj1 = a.getInstance();
        
    }
}
class a{
  static a obj = new a();
  private a (){

  }
  public static a getInstance(){
    return obj;
  }
}