public class Oops_Interface_DSA {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;

        LinearSearch ls = new LinearSearch();

        System.out.println(ls.search(arr, target));
    }

    public interface Searcher {
        int search(int[] arr, int target);
    }

    static class LinearSearch implements Searcher {

        @Override
        public int search(int[] arr, int target) {
            for (int i = 0 ; i < arr.length ; i ++ ){
                if ( arr[i] == target ){
                    return i ;
                }
            }
            return -1 ;
        }
    }
}