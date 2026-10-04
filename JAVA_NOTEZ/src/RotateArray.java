import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        rotate(arr, k);

    }

    static void rotate (int [] arr , int k ){
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

    }
    static void reverse(int[] arr, int start, int end) {

        while (start < end){
            int temp = arr[start] ;
            arr[start] = arr[end];
            arr[end] = temp ;


            start++ ;
            end -- ;


        }

    }

}
