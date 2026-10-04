import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args ) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int [n] ;

        int target = sc.nextInt();

        System.out.println(search( arr , target ));

    }

    static int search (int [] arr , int target ){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target) ;
            return target ;
        }
        return -1;
    }

}
