import java.util.ArrayList;
import java.util.Scanner;

    public class Cyclic_many_dup {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            sort(arr);

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    ans.add(arr[i]);
                }
            }

            System.out.println(ans);
        }

        static void sort(int[] arr) {

            int i = 0;

            while (i < arr.length) {

                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
        }

        static void swap(int[] arr, int first, int second) {

            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

