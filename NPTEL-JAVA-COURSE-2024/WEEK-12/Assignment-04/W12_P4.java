// Write a program to solve the given Sudoku.

// 530070000
// 600195000
// 098000060
// 800060003
// 400803001
// 700020006
// 060000280
// 000419005
// 000080079
// (0 is unsloved)
public class W12_P4 {

    public boolean solveSudoku(int[][] board) {
        return solve(board);
    }

    private boolean solve(int[][] board) {
        int[] emptySpot = findEmptySpot(board);
        if (emptySpot == null) {
            // No empty spots left, puzzle solved
            return true;
        }

        int row = emptySpot[0];
        int col = emptySpot[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (solve(board)) {
                    return true;
                }

                // Backtrack
                board[row][col] = 0;
            }
        }

        // No number worked, backtrack
        return false;
    }

    private int[] findEmptySpot(int[][] board) {
        int[] result = new int[2];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    result[0] = row;
                    result[1] = col;
                    return result;
                }
            }
        }
        return null; // No empty spots left
    }

    private boolean isValid(int[][] board, int row, int col, int num) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int boxStartRow = row - row % 3;
        int boxStartCol = col - col % 3;
        for (int i = boxStartRow; i < boxStartRow + 3; i++) {
            for (int j = boxStartCol; j < boxStartCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        W12_P4 solver = new W12_P4();
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        //System.out.println("Sudoku board before solving:");
        //solver.printBoard(board);
        if (solver.solveSudoku(board)) {
            //System.out.println("\nSudoku board after solving:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
