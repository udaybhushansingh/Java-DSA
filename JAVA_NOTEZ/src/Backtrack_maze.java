public class Backtrack_maze {
    public static void main(String[] args) {
        int n = 3;


        boolean[][] blocked = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };

        maze(0, 0, n, "", blocked);

    }

    static void maze(int rows, int cols, int n, String path, boolean[][] blocked) {

        if (rows >= n || cols >= n) {
            return;
        }

        if (blocked[rows][cols]) {
            return;
        }

        if (rows == n - 1 && cols == n - 1) {
            System.out.println(path);
            return;
        }

        maze(rows, cols + 1, n, path + "R", blocked);
        maze(rows + 1, cols, n, path + "D", blocked);
    }
}