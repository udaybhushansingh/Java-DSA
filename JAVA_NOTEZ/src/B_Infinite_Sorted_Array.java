import java.util.Scanner;

public class B_Infinite_Sorted_Array {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int target = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = find(arr, target);

            System.out.println(ans);
        }

        static int find(int[] arr, int target) {

            int start= 0 ;
            int end =   1 ;

            while ( end < arr.length && target > arr[end]){
                int newstart = end + 1 ;
                end = end + ( end - start +1 ) *2 ;
                    start = newstart ;
            }

            if (end >= arr.length ){
                end  = arr.length -1 ;
            }


            // Binary Search
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;
                }
            }

            return -1;
        }
    }
