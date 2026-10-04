public class Rec__n_to_1 {
    static void main(String[] args) {
        fun(5);
    }

    static int fun(int n ){
        if (n ==0 ){
            return 0 ;
        }
        System.out.print(n);
        fun(n-1);
        return n;
    }

}