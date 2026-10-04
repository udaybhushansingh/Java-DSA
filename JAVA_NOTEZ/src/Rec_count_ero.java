public class Rec_count_ero {
    static void main(String[] args) {
        System.out.println(count(120502450));
    }

    static int count (int n ){
        return zero(n , 0 );
    }
    private static int zero(int n , int c ){
        if (n== 0){
            return c;
        }
        else {
            int rem = n % 10 ;
            if (rem == 0 ){
                return zero(n/10  , c+1);
                }
            }
        return zero(n/10 , c);
        }
    }

