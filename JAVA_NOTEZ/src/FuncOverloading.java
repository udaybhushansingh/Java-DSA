import java.util.Arrays;

public class FuncOverloading {

    public static void main(String[] args) {
        fun(2, 4, 1, 4, 4);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String name) {
        System.out.println("Second one");
    }
}