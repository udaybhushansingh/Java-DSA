public class Back_Word_Exist {
    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";  // * BRAIN IS NOT BRAINING *

        System.out.println(exist(board, word));
    }

    static boolean exist(char[][] board, String word) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {

                if (search(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean search(char[][] board, String word, int row, int col, int index) {

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 ||
                row >= board.length || col >= board[0].length) {
            return false;
        }

        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';   // mark visited

        boolean found =
                        search(board, word, row + 1, col, index + 1)
                                ||

                        search(board, word, row - 1, col, index + 1)
                                ||

                        search(board, word, row, col + 1, index + 1)
                                ||

                        search(board, word, row, col - 1, index + 1);

        board[row][col] = temp;  // backtrack

        return found;
    }
}