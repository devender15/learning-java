package backtracking;

public class SudokuSolver {

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if you find some empty element in row, then break
            if(!emptyLeft) break;
        }

        if(emptyLeft) return emptyLeft;

        // backtrack
        for (int number = 1; number<=9; number++) {
            if(isSafe(board, row, col, (char) (number))) {
                board[row][col] = (char) (number);
                if(solve(board)) {
                    // found the answer
//                    display(board);
                    return true;
                } else {
                    // backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static void display(char[][] board) {
        for (char[] row: board) {
            for(char num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        // check for row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row or not
            if(board[row][col]==num) return false;
        }
        // check for col
        for (char[] nums: board) {
            // check if the number is in the row or not
            if(nums[col]==num) return false;
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row-row%sqrt;
        int colStart = col-col%sqrt;

        for (int r=rowStart; r<rowStart+sqrt; r++) {
            for (int c = colStart; c<colStart+sqrt ; c++) {
                if(board[r][c]==num) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        int[][] board = {
//                {3, 0, 6, 5, 0, 8, 4, 0, 0},
//                {5, 2, 0, 0, 0, 0, 0, 0, 0},
//                {0, 8, 7, 5, 0, 8, 4, 3, 1},
//                {0, 0, 3, 0, 1, 0, 0, 8, 0},
//                {9, 0, 0, 8, 6, 3, 0, 0, 5},
//                {0, 5, 0, 0, 9, 0, 6, 0, 0},
//                {1, 3, 0, 0, 0, 0, 2, 5, 0},
//                {0, 0, 0, 0, 0, 0, 0, 7, 4},
//                {0, 0, 5, 2, 0, 6, 3, 0, 0},
//        };

        char[][] board = {
//                {'5','3','.','.','7','.','.','.','.'},
//                {"6",".",".","1","9","5",".",".","."},
//                {".","9","8",".",".",".",".","6","."},
//                {0, 0, 3, 0, 1, 0, 0, 8, 0},
//                {9, 0, 0, 8, 6, 3, 0, 0, 5},
//                {0, 5, 0, 0, 9, 0, 6, 0, 0},
//                {1, 3, 0, 0, 0, 0, 2, 5, 0},
//                {0, 0, 0, 0, 0, 0, 0, 7, 4},
//                {0, 0, 5, 2, 0, 6, 3, 0, 0},
        };

//        System.out.println(solve(board));
        if(solve(board)) {
            display(board);
        } else {
            System.out.println("False");
        }
    }
}
