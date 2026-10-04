public class Back_maze_4D {
        public static void main(String[] args) {

                int n = 3;

                boolean[][] visited = new boolean[n][n];

                maze(0, 0, n, "", visited);
            }

        static void maze(int rows, int cols, int n, String path, boolean[][] visited) {

            if (rows >= n || cols >= n ||  rows< 0 || cols < 0) {
                return;
            }

            if (visited[rows][cols]) {
                return;
            }

            if (rows == n - 1 && cols == n - 1) {
                System.out.println(path);
                return;
            }

            visited[rows][cols] = true;


            maze(rows, cols + 1, n, path + "R",visited );
            maze(rows + 1, cols, n, path + "D", visited);
            maze(rows, cols - 1, n, path + "L",visited);
            maze(rows -1 , cols, n, path + "U",visited);

            visited[rows][cols] = false;
        }
    }

