import java.util.ArrayList;

public class Cyclic_Sort_Missing_in_nums {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2 ,2, 8, 8, 2, 3, 1};

        sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        sort(arr);
         // duplicate

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
                System.out.println("Duplicate: " + arr[i]);
                System.out.println("Missing: " + (i + 1));

                return;
            }
        }
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