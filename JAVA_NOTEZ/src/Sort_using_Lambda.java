
import java.util.Arrays;
import java.util.Comparator;
public class Sort_using_Lambda {
    static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr,  (a , b) -> b - a ) ;

        for (int num : arr){
            System.out.println(num +" ");
        }

    }
}
