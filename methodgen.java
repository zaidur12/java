class Demo{
     public <T> void print(T value){
       System.out.println(value);
     }
}

public class methodgen {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print(89);
        demo.print("heloo");
    }
}
