public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        // Use three boolean arrays to check rows, columns, and 3x3 grids.
        boolean[][] rowCheck = new boolean[9][9];
        boolean[][] colCheck = new boolean[9][9];
        boolean[][] gridCheck = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char key = board[i][j];
                if (key != '.') {
                    int num = key - '1'; // Convert character to integer (0-8)
                    int gridIndex = (i / 3) * 3 + (j / 3); // Calculate 3x3 grid index

                    // Check if the same number is already in the current row, column, or grid.
                    if (rowCheck[i][num] || colCheck[j][num] || gridCheck[gridIndex][num]) {
                        return false;
                    }

                    // Mark the number as seen in the current row, column, and grid.
                    rowCheck[i][num] = true;
                    colCheck[j][num] = true;
                    gridCheck[gridIndex][num] = true;
                }
            }
        }

        return true;
    }
}