public class Rec_bubble_sort {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 3, 1, 6};

        bub(arr , arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void bub(int[] arr, int n ) {

            // Base case
            if (n == 1) {
                return;
            }

            // One pass
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }

            // Next pass
            bub(arr, n - 1);
        }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}