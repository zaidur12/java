class ZRexpectation extends Exception{
    public ZRexpectation(String string){
        super(string);
    }
}

public class expectionn {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        String str = null;
        try {
            if(j== 0)
                throw new ZRexpectation("error");
            
          
        }
        catch(ZRexpectation e){
           System.out.println("Something went wrong " + e);
        }
        catch(Exception e){
           System.out.println("Something went really wrong " + e);
        }
        System.out.println(j);
        System.out.println("Yo");
    }
}
