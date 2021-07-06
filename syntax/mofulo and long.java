lass Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        long    M = 1000000007;
        long[][] dp = new long[m][n];
        dp[0][0] = 1;
        for(int i=1;i<n;i++)
         dp[0][i] = 1;
         
        for(int i=1;i<m;i++)
         dp[i][0] = 1;
         
        for(int i=1;i<m;i++)
         for(int j=1;j<n;j++){
             dp[i][j] = (((dp[i-1][j])+dp[i][j-1]))%M;
         }
        return dp[m-1][n-1];
    }
}
