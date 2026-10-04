import java.util.Arrays;

public class Cyclic_Sort_Missing_element {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        sort(arr);

        for (int index = 1 ; index < arr.length; index++) {
            if (arr[index] != index) {
                System.out.println("Missing number: " + index);
                return;
            }
        }


        System.out.println("Missing number: " + arr.length);
    }

    static void sort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]) {
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