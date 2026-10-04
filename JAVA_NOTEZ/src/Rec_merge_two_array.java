public class Rec_merge_two_array {
    static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 8};
        int[] arr2 = {2, 4, 6, 7};

        int[] result = new int[arr1.length + arr2.length];

        int[] ans = TwoMerge(arr1, arr2, result);

        for (int num : ans) {
            System.out.print(num + " ");
        }


    }

    static int[] TwoMerge(int[] arr1, int[] arr2, int[] result) {
        result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }
}