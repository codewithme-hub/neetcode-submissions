class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] !='.'){
                    char num = board[i][j];
                    board[i][j] = '.';
                    if(!isValid(board,i,j,num)) return false;
                    board[i][j] = num;
                }
            }
        } return true;
    }
    public boolean isValid(char[][] board,int row , int col,char num){
       for(int i=0;i<9;i++){
        // same row
        if(board[row][i]==num) return false;

        // same col
        if(board[i][col]== num) return false;
         if(board[3*(row/3) + i/3][3*(col/3) + i%3] == num) return false;

       } 
       return true;
    }
}
