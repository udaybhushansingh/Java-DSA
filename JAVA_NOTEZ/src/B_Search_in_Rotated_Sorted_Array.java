import java.util.Scanner;

public class B_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = find(arr, target);

        System.out.println(ans);
    }

    static int find(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Find peak
        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[start] <= arr[mid]) {
                // left half is sorted

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;       // search left
                } else {
                    start = mid + 1;     // search right
                }

            } else {
                // right half is sorted

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;     // search right
                } else {
                    end = mid - 1;       // search left
                }
            }
        }
        return start;
    }
}
