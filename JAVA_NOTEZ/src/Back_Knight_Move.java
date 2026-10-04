public class Back_Knight_Move {

        public static void main(String[] args) {

            int n = 5;
            int[][] board = new int[n][n];

            board[0][0] = 1;

            if (knightTour(board, 0, 0, 1)) {
                display(board);
            } else {
                System.out.println("No solution");
            }
        }

        static boolean knightTour(int[][] board, int row, int col, int move) {

            // Base case
            if (move == 25) {
                return true;
            }

            int[] rowMove = {-2, -2, -1, -1, 1, 1, 2, 2};
            int[] colMove = {-1, 1, -2, 2, -2, 2, -1, 1};

            // Try all 8 knight moves
            for (int i = 0; i < 8; i++) {

                int newRow = row + rowMove[i];
                int newCol = col + colMove[i];

                // Check valid and unvisited
                if (newRow >= 0 && newRow < board.length &&
                        newCol >= 0 && newCol < board.length &&
                        board[newRow][newCol] == 0) {

                    // Place next move
                    board[newRow][newCol] = move + 1;

                    // Recursive call
                    if (knightTour(board, newRow, newCol, move + 1)) {
                        return true;
                    }

                    // Backtrack
                    board[newRow][newCol] = 0;
                }
            }

            return false;
        }

        static void display(int[][] board) {

            for (int[] row : board) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }