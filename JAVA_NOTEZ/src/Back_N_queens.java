public class Back_N_queens {
    static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static void queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1);
                board[row][col] = false;

            }
        }

    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // cheak coloums
        for (int r = 0; r < row; r++) {
            if (board[r][col]) {
                return false;
            }
        }
        // cheak upper left diagonal
        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;

            }
            r--;
            c--;
        }


        // cheak upper right diagonal
        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }


    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
