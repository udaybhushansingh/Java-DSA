import java.util.ArrayList;

public class Rec_Target {

    public static void main(String[] args) {

        int[] arr = {9, 4, 6, 4, 8, 4};
        int target = 4;

        ArrayList<Integer> ans = findAll(arr, target, 0);

        System.out.println(ans);
    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> below = findAll(arr, target, index + 1);
        list.addAll(below);

        return list;
    }
}