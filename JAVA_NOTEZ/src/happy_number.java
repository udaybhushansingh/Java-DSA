public class happy_number {

        public static void main(String[] args) {
            int n = 19;
            System.out.println(isHappy(n));
        }

        static boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do {
                slow = sumOfSquares(slow);
                fast = sumOfSquares(sumOfSquares(fast));
            } while (slow != fast);

            return slow == 1;
        }

        static int sumOfSquares(int n) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            return sum;
        }
    }