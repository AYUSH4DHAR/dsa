 int lcs(int x, int y, string s1, string s2)
    {
        //using dp[][] array to store length of LCS.
        int dp[1001][1001];
        
        //Following steps build dp[x+1][y+1] in bottom up fashion. Note that 
        //dp[i][j] contains length of LCS of s1[0..i-1] and s2[0..j-1].
        for(int i=0;i<=x;i++)
        {
            for(int j=0;j<=y;j++)
            {
                //if i or j is 0, we mark dp[i][j] as 0.
                if(i==0||j==0)
                dp[i][j]=0;     
                
                //else if the current char in both strings are equal, we add 1 
                //to the output we got without including these both characters.
                else if (s1[i-1] == s2[j-1])        
                dp[i][j] = dp[i-1][j-1] + 1; 
                
                //else s1[i-1]!=s2[j-1] so we check the max output which 
                //comes from s1 or s2 without considering current character.
                else
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]); 
            }
        }
        
        //returning the result.
        return dp[x][y];   
    }
};
