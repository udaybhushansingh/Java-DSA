public class Rec_selection_sort {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 3, 1, 6};

        sel(arr, arr.length, 0);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sel(int[] arr, int n, int start) {

        if (n == 1) {
            return;
        }

        int min = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        swap(arr, start, min);

        sel(arr, n - 1, start + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}