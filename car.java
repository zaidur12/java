class carr{
    String brand ;
    Float speed ;

    void display(){
        System.out.println("Your Car brand is "+ brand +" " + "aveg spped is "+speed);
    }
}
public class car {
    public static void main(String[] args) {
       carr obj = new carr();
       obj.brand = "TATA";
       obj.speed = 67.90f;
       obj.display();
    }
    
}
