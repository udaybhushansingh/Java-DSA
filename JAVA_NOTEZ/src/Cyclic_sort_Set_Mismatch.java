public class Cyclic_sort_Set_Mismatch {
   public static void main(String[] args) {
       int arr[] = {1 ,2, 4, 4, 5}; // 1 2 4 4 5

        sort(arr);

       for (int i = 0; i < arr.length; i++) {

           if (arr[i] != i + 1) {

               int duplicate = arr[i];
               int missing = i + 1;

               System.out.println("Duplicate: " + duplicate);
               System.out.println("Missing: " + missing);

               break;
           }
       }



   }
    static void sort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] -1;

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

