public class Rev {
    public static void main(String[] args){
        int input = 1234;
        int rem= 0 ;
        while(input>0){
            int numm = input%10;
            rem = rem *10+numm;
            input = input/10; 
        }
        System.out.println(rem);
        
    }
}
