class Solution {
    public boolean isValid(char x, char[][] board, int row, int col) {
        //check duplicates in row
        for(int j = 0; j < 9; j++) {
            if(j != col && board[row][j] == x) return false; 
        }

        //check duplicates in col
        for(int i = 0; i < 9; i++) {
            if(i != row && board[i][col] == x) return false;
        }

        //check element in 3x3 grid
        int gridStartRow = 3 * (row / 3), gridStartCol = 3 * (col/3);
        for(int i = gridStartRow; i < gridStartRow + 3; i++) {
            for(int j = gridStartCol; j < gridStartCol + 3; j++) {
                if(i==row && j==col) continue;
                if(board[i][j] == x) return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.' && isValid(board[i][j], board, i, j) == false) return false;
            }
        }

        return true;
    }
}
