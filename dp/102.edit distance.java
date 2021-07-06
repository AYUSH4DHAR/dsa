  public int editDistance(String s, String t) {
        // Code here
        int n1 = s.length();
        int n2 = t.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i<=n2;i++)
         dp[0][i] = i;
        for(int i=0;i<=n1;i++){
            dp[i][0] = i;
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                
                if(s.charAt(i-1)==t.charAt(j-1))
                   dp[i][j] = dp[i-1][j-1];
                else
                 dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
            }
        }
        return dp[n1][n2];
        
    }
}
