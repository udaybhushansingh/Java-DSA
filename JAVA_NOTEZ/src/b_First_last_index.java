import java.util.Scanner;

public class b_First_last_index {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n] ;
        int target = sc.nextInt();

        for (int i = 0 ; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        int first = search(arr, target, true);
        int last = search(arr, target, false);

    }

    static int search(int[] arr, int target, boolean findFirst) {

        int start = 0;
        int end = arr.length - 1;

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {

                ans = mid;

                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}