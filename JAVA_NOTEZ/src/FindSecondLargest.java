import java.util.Scanner;

public class FindSecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SecLargest(arr));

    }

    static int SecLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int Sec = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                Sec = largest;
                largest = arr[i];

            } else if (arr[i] > Sec && arr[i] != largest) {
                Sec = arr[i];

            }

        }


        return largest;
    }

}
