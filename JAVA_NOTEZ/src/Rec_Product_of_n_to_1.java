public class Rec_Product_of_n_to_1 {
    static void main(String[] args) {
        func(6);
    }
    static int func(int n) {
        if (n == 1) {
            return 1;
        }

        return n * func(n - 1);
    }
}
