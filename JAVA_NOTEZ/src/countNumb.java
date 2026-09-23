public class countNumb {
    static void main() {
        int n = 235636;
        int count = 0 ;

        while ( n > 0 ){
            int rem  = n % 10 ;
            if (rem == 6 ){
                count ++ ;

            }
            n = n /10 ;
        }
        System.out.println(count);
    }
}
