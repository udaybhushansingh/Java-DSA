import static java.lang.Long.sum;

public class Rec_sum {
    static void main(String[] args) {
       int ans = func(7644);
        System.out.println(ans);
    }

    static int func(int n) {
        if (n == 0) {
            return 0;


        } else {
            return (n % 10) + func(n / 10);
        }
    }
}