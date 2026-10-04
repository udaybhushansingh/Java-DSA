public class Oops_Abstract_Class {
    void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        BubbleSort b = new BubbleSort();
        b.sort(arr);
        b.display(arr);

    }
    abstract class Sorter {

        abstract void sort(int[] arr);

        void display(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    class BubbleSort extends Sorter {
        @Override
        void sort(int[] arr) {
            for ( int i = 0 ; i < arr.length ; i++ ){
                for (int j = 0 ; j < arr.length - i - 1 ; j++  ){
                    if (arr[i] < arr[j] ){
                            swap(arr, j , j +1 );
                    }
                }
            }
        }

        }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

