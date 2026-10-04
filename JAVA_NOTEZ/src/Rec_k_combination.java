import java.util.ArrayList;

public class Rec_k_combination {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> result = new ArrayList<>();
        combo(arr, 0, 2, result);


    }
    static void combo(int [] arr , int index , int k , ArrayList<Integer>result ) {
        if (result.size() == k) {
            System.out.println(result);
            return;
        }

        if (index == arr.length) {
            return;
        }

        result.add(arr[index]);
        combo(arr, index + 1, k, result);

        result.remove(result.size() - 1);

        combo(arr, index + 1, k, result );

    }
}
