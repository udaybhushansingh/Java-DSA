public class Rec_Pattern {
    public static void main(String[] args) {
        pattern(1, 1, 5);
    }

    static void pattern(int row, int col, int n) {

        if (row > n) {
            return;
        }

        if (col > row) {
            System.out.println();
            pattern(row + 1, 1, n);
            return;
        }

        System.out.print("* ");
        pattern(row, col + 1, n);
    }
}