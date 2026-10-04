import java.util.Scanner;

public class B_SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        char target = sc.next().charAt(0);

        char ans = find(arr, target);

        System.out.println(ans);
    }

    static char find(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}