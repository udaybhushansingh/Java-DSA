import java.util.Scanner;
public class B_TF_Search_in_Rotated_Sorted_Array_II {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int target = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(search(arr, target));
        }

        static boolean search(int[] arr, int target) {

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return true;
                }

                // Duplicates: cannot determine which half is sorted
                if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                    start++;
                    end--;
                }

                // Left half is sorted
                else if (arr[start] <= arr[mid]) {

                    if (target >= arr[start] && target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

                // Right half is sorted
                else {

                    if (target > arr[mid] && target <= arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }

            return false;
        }
    }