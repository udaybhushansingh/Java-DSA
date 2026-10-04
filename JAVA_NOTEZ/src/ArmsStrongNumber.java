
public class ArmsStrongNumber {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmsStrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmsStrongNumber(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }

        return sum == original;
    }
}
