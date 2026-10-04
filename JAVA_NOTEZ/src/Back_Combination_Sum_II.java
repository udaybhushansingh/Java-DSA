import java.util.ArrayList;
import java.util.Arrays;

public class Back_Combination_Sum_II {
    static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        Arrays.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();

        Sums(arr, 0, target, result);

    }

    static void Sums(int[] arr, int index, int target,
                     ArrayList<Integer> result) {

        if (target == 0) {
            System.out.println(result);
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            result.add(arr[i]);

            Sums(arr, i + 1, target - arr[i], result);

            result.remove(result.size() - 1);
        }
    }
}