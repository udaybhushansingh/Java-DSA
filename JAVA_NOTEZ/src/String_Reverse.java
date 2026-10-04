public class String_Reverse {
    static void main(String[] args) {
        String str = "hello";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}