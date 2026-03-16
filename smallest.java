public class smallest {
      public static void main(String[] args){
        int arr [] = {2,6,7,2,1};
        float min = Float.POSITIVE_INFINITY;
        for(int i=0;i<arr.length;i++){
           if(arr[i]< min){
            min = arr[i];
           }
        }
        System.out.println((int)min);

    }
}
