import java.util.Scanner;

public class MinimumiLinear {
   public  static void main() {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] arr = new int[n];

       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
       int ans = min(arr);

       System.out.println(ans);


       }
       static int min(int [] arr ){

           int min = arr[0];
           for (int i = 0; i < arr.length; i++){
               if (arr[i] < min){
                   min = arr[i] ;

               }

           }

           return min;
       }
}
