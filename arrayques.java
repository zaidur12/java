public class arrayques {
    public static void main(String[] args) {
        int[] myArray = {5,10,20,30,40,50};
        for(int i=0;i<myArray.length;i++){
            if(i==0)
              continue;
            System.out.println(myArray[i]);
        }
    }
}
