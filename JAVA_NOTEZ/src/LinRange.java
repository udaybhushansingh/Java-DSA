import java.util.Scanner;

public class LinRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();




        int ans = range(arr, target, start, end);

        System.out.println(ans);
    }
    static int range (int [] arr ,int target, int start , int end ) {

        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
