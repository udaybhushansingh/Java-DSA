public class Pattern_Questions {

    public static void main(String[] args) {
        pattern1 (6);


    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0 ; space < n - row; space ++ ) {
                System.out.print(" ");
            }

            for (int cols = row; cols >= 1; cols--) {
                System.out.print(cols);
            }

            for (int cols = 2; cols <= row; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= n - row + 1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalrow = row > n ? 2 * n - row : row;
            for (int cols = 0; cols <= totalrow; cols++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        for (int row = 0; row <= 2 * n; row++) {

            int totalrow = row > n ? 2 * n - row : row;

            int noofrows = n - totalrow;

            for (int s = 0 ; s < noofrows  ; s++ )
                System.out.print(" ");



            for (int cols = 0; cols <= totalrow; cols++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}