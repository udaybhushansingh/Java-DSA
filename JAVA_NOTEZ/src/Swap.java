
public class Swap {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[] result = swap(a, b);

        a = result[0];
        b = result[1];

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }
}
