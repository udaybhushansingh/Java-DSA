public class Generic {
    static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        String[] names = {"Ram", "Sam", "John"};

        printArray( nums);
        printArray( names);
    }

    static <T> void printArray(T[] arr) {
        for ( T element  :arr){
            System.out.println(element);

        }

    }
}
