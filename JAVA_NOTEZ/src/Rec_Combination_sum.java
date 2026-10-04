import java.util.ArrayList;

public static void main(String[] args) {
    int[] arr = {1, 2, 3};

    ArrayList<Integer> result = new ArrayList<>();
    boolean[] used = new boolean[arr.length];

    permu(arr, result, used);
}
    static void permu(int[] arr, ArrayList<Integer> result, boolean[] used) {

        if (result.size() == arr.length) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!used[i]) {
                result.add(arr[i]);
                used[i] = true;

                permu(arr, result, used);

                result.remove(result.size() - 1);
                used[i] = false;
            }
        }
    }