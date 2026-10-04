
import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        fun(2,4,1,4,4);

    }
    static void fun (int ...v ){
        System.out.println(Arrays.toString(v));
    }
}
