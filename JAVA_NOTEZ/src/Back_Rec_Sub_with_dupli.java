import java.util.ArrayList;
import java.util.Arrays;

public class Back_Rec_Sub_with_dupli {
    public static void main(String[] args) {
            int[] arr = {1, 2, 2};

            Arrays.sort(arr);

            ArrayList<Integer> result = new ArrayList<>();

            subsets(arr, 0, result);
        }

        static void subsets(int[] arr, int index, ArrayList<Integer> result) {

            System.out.println(result);

            for (int i = index; i < arr.length; i++) {

                // Skip duplicate at the same level
                if (i > index && arr[i] == arr[i - 1]) {
                    continue;
                }

                result.add(arr[i]);

                subsets(arr, i + 1, result);

                // Backtrack
                result.remove(result.size() - 1);
            }
        }
    }