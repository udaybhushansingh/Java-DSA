import static java.lang.Long.sum;

public class Rec_product {
    static void main(String[] args) {
        int ans = func(7644);
        System.out.println(ans);
    }

    static int func(int n) {
        if (n%10 == n) {
            return n;


        } else {
            return (n % 10) * func(n / 10);
        }
    }
}