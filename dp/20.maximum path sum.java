class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        int dp[][] = new int[N][N];
        for(int i = 0;i < N;i++)
            dp[0][i] = Matrix[0][i];
            
        // calculating the path sums of the matrix
        for(int i = 1;i < N;i++){
            for(int j = 0;j < N;j++){
                if(j == 0 && j+1 < N)
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j],dp[i-1][j+1]);
                else if(j-1>=0 && j == N-1)
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j],dp[i-1][j-1]);
                else if(j > 0 && j+1 < N)
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j],Math.max(dp[i-1][j-1],dp[i-1][j+1]));
                else
                    dp[i][j] = Matrix[i][j] + dp[i-1][j];
            }
        }
        
        // getting the maximum path sum
        int maxi = 0;
        for(int i = 0;i < N;i++)
            maxi = Math.max(maxi, dp[N-1][i]);
        
        return maxi;
    }
}
 minimum path sum
   public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        
        int[][] dp = new int[n][m];
        dp[0][0] =  grid[0][0] ;
        for(int i=1;i<m;i++)
             dp[0][i] = dp[0][i-1]+ grid[0][i];
        for(int j=1;j<n;j++)
             dp[j][0] = dp[j-1][0]+ grid[j][0];
         
        for(int i=1;i<n;i++)
            for(int j=1;j<m;j++){
                dp[i][j]  = Math.min(dp[i-1][j] , dp[i][j-1]) + grid[i][j];
            }
        return dp[n-1][m-1];
    }
}
