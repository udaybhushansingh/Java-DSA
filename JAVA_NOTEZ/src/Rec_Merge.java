public class Rec_Merge{

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 3, 1, 6};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void mergeSort(int[] arr, int s, int e) {

        // Base case
        if (s >= e) {
            return;
        }

        int m = s + (e - s) / 2;

        // Sort left half
        mergeSort(arr, s, m);

        // Sort right half
        mergeSort(arr, m + 1, e);

        // Merge both halves
        merge(arr, s, m, e);
    }

    static void merge(int[] arr, int s, int m, int e) {

        int[] temp = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        // Compare both halves
        while (i <= m && j <= e) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left
        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements from right
        while (j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[s + x] = temp[x];
        }
    }
}