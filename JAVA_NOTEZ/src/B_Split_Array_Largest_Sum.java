import java.util.Scanner;

public class B_Split_Array_Largest_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = find(arr, m);

        System.out.println(ans);
    }

    static int find(int[] arr, int m) {

        int start = 0;
        int end = 0;

        for (int num : arr) {
            start = Math.max(start, num);
            end += num;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int sum = 0;
            int piece = 1;

            for (int num : arr) {

                if (sum + num > mid) {
                    sum = num;
                    piece++;
                } else {
                    sum += num;
                }
            }

            if (piece <= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}