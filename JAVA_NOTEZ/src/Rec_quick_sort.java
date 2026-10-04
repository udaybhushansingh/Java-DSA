public class Rec_quick_sort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2, 7};


        quick(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }



    static void quick(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int p = partition(arr, low, high);

        quick(arr, low, p - 1);
        quick(arr, p + 1, high);
    }
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
