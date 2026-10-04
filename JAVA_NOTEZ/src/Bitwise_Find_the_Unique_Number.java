import java.util.Scanner;

public class Bitwise_Find_the_Unique_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr = new int[num1];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // XOR all numbers
        int xor = 0;

        for (int num : arr) {
            xor = xor ^ num;
        }

        // Find rightmost set bit
        int setbit = xor & -xor;

        int firstbit = 0;
        int second = 0;

        // Divide into two groups
        for (int num : arr) {
            if ((num & setbit) != 0) {
                firstbit = firstbit ^ num;
            } else {
                second = second ^ num;
            }
        }

        System.out.println(firstbit);
        System.out.println(second);
    }
}