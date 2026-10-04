import static java.util.Collections.reverse;

public class Rec_palindrome {
    static void main(String[] args) {
        int n = 121;

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverse(n / 10, rev);
    }
}

