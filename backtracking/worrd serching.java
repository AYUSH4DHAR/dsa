class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[i].length;j++)
                if(board[i][j]==word.charAt(0))
                     if(se(0,board,word,i,j))
                         return true;
        return false;
    }
    boolean se(int index, char[][] board,String word,int i,int j){
        if(index==word.length())
            return true;
        if(i>=board.length || i<0 || j>=board[i].length||j<0 )
            return false;
        if(word.charAt(index)!=board[i][j])
            return false;
         
        char temp =  board[i][j];
        board[i][j] = '#';
        boolean flag = se(index+1,board,word,i+1,j)||
            se(index+1,board,word,i,j+1)||
            se(index+1,board,word,i,j-1)||
            se(index+1,board,word,i-1,j);
            board[i][j] = temp;
        return flag;
        
    }
}
