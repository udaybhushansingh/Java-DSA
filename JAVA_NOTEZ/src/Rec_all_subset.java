import java.util.ArrayList;

public class Rec_all_subset {
        static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            ArrayList<Integer> result = new ArrayList<>();
            allsubs(arr, 0, result);


        }
        static void allsubs(int [] arr , int index , ArrayList<Integer>result ) {
            if (index == arr.length ) {
                System.out.println(result);
                return;
            }
            // take
            result.add(arr[index]);
            allsubs(arr, index + 1, result);

            // undo
            result.remove(result.size() - 1);

            // skip
           allsubs(arr, index + 1, result);
        }
}
