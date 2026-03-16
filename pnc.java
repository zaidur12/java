public class pnc {
    public static void main(String[] args) {
        int arr[] = { -1, 1, -2, 2, -3, 3, -4};
        int count_postive = 0;
        int count_negative = 0;


        for (int i=0;i<arr.length;i++){
              if(arr[i]<0){
                count_negative=count_negative+1;
              }
              else if(arr[i]>=0){
               count_postive = count_postive+1;
              }
              else{
                System.out.println("Invalid");
              }
        }
        System.out.println(count_negative);
        System.out.println(count_postive);
    }
}
