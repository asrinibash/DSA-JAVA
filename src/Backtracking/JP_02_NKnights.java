package Backtracking;


public class JP_02_NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 4);
    }

    static void knights(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            knights(board, row + 1, 0, knight);
            return;
        }


        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }
        knights(board, row, col + 1, knight);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) return false;
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) return false;
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) return false;
        }

        if (isValid(board, row - 1, col + 2)) {
            return !board[row - 1][col + 2];
        }
        return true;
    }

    //do not repeat yourself,hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
