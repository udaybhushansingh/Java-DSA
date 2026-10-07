import java.util.Stack;

public class Stack_Two_game {

    public static void main(String[] args) {

        int[] A = {4, 2, 4, 6, 1};
        int[] B = {2, 1, 8, 5};

        int x = 10;

        System.out.println(maxElements(A, B, x));
    }

    static int maxElements(int[] A, int[] B, int x) {

        int sum = 0;
        int i = 0;
        int count = 0;

        // Take as many elements as possible from A
        while (i < A.length && sum + A[i] <= x) {
            sum += A[i];
            i++;
        }

        count = i;

        // Now start taking from B
        int j = 0;

        while (j < B.length) {

            sum += B[j];
            j++;

            // Remove elements from A if sum exceeds x
            while (sum > x && i > 0) {
                i--;
                sum -= A[i];
            }

            if (sum > x) {
                break;
            }

            count = Math.max(count, i + j);
        }

        return count;
    }
}