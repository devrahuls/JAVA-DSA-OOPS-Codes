package Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6 ,0 ,0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0 ,0 ,0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)){
            display(board);
        }else {
            System.out.println("Sudoku can not be solved");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //This is how we are replacing the row and col from the arguments.As we are not taking here as taken in NQueen and NKnights.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col =  j;
                    emptyLeft = false;
                    break;
                }
            }

            //When you have traverse the entire row
            //If you found some empty element in row, then break
            if (emptyLeft == false){
                break;
            }
        }

        if (emptyLeft == true){
            return true;
            //Means Sudoku is solved!
        }

        //Now Backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    //If this is true, means we have found our answer
                    return true;
                }else {
                    //Backtrack
                    board[row][col] = 0;
                }
            }
        }

        //Means Sudoku can not be solved
        return false;
    }

    static void display(int[][] board){
        for (int[] row : board){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){

        //Check the row
        for (int i = 0; i < board.length; i++) {

            //Check if the number is in the row
            if (board[row][i] == num){
                return false;
            }
        }


        //Check the col
        //For every rows of each col
        for(int[] nums : board){
            //Check if the number exists in the col
            if (nums[col] == num){
                return false;
            }
        }


        //In each sub-boxes
        int sqrt = (int)(Math.sqrt(board.length));
        //Starting point of the sub-boxes
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r ++){
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }


        return true;
    }
}
