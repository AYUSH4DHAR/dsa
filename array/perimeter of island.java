// class Solution {
//     int  p=0;
//     public int islandPerimeter(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
        
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                    if(grid[i][j]==1)
//                    {
//                        if(ch(grid,i+1,j,n,m))
//                           p++;
//                        if(ch(grid,i,j+1,n,m))
//                           p++;
//                        if(ch(grid,i,j-1,n,m))
//                           p++;
//                        if(ch(grid,i-1,j,n,m))
//                           p++;
//                    }
//                }
//         }
//     return p;
                    
//     }
//     boolean ch(int[][] grid , int i , int j,int n , int m){
//         if(i>=n || i<0 || j<0 || j>=m || grid[i][j]==0)
//             return true;
//      return false;
//     }
                          
// }

class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    
                    //assume it is an unconnected cell with perimeter = 4
                    p += 4;
                    
                    //check connection to the left
                    if(j > 0 && grid[i][j - 1] == 1) p += -2;
                    
                    //check connection up
                    if(i > 0 && grid[i-1][j] == 1) p += -2;
                    
                    //check connection to the right
                    // if(j < n - 1 && grid[i][j + 1] == 1) p += -1;
                    
                    //check bottom connection
                    // if(i < m - 1 && grid[i+1][j] == 1) p += -1;
                }
            }
        }
        
        return p;
    }
}
