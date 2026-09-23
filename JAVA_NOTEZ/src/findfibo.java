import java.util.Scanner;

public class findfibo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Terms :");
        int n = sc.nextInt();

        int firstTerm = 0 ;
        int SecondTerm = 1 ;

        for (int  i  = 1 ; i <=n ; i ++  ){
            System.out.println(firstTerm + " ");

            int nextTerm = firstTerm + SecondTerm ;
            firstTerm = SecondTerm ;
            SecondTerm = nextTerm;

        }

    }
}
