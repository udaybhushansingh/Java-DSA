import java.util.Scanner;

public class MaxLinear {
    public  static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = max(arr);

        System.out.println(ans);


    }
    static int max(int [] arr ){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i] ;

            }

        }

        return max;
    }
}
