public class Rec_0_to_n {
    static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return ;
        } else {
            fun(n - 1);
            System.out.print(n);
        }
        return ;

    }
}

