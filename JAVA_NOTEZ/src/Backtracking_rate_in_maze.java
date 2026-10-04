public class Backtracking_rate_in_maze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {0, 1, 1, 1}
        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        ratMaze(maze, 0, 0, "", visited);
    }

    static void ratMaze(int[][] maze, int rows, int cols, String path, boolean[][] visited) {
        if (rows < 0 || cols < 0 || rows >= maze.length || cols >= maze[0].length) {
            return;
        }
        if (maze[rows][cols] == 0) {
            return;
        }
        if (rows == maze.length - 1 && cols == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (visited[rows][cols]) {
            return;
        }

        visited[rows][cols] = true;

        ratMaze(maze, rows + 1, cols, path + "D", visited);
        ratMaze(maze, rows - 1, cols, path + "U", visited);
        ratMaze(maze, rows, cols + 1, path + "R", visited);
        ratMaze(maze, rows, cols - 1, path + "L", visited);

        visited[rows][cols] = false;
    }
}


