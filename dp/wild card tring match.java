static boolean match(String first, String second)
{
 
    // If we reach at the end of both strings,
    // we are done
    if (first.length() == 0 && second.length() == 0)
        return true;
 
    // Make sure that the characters after '*'
    // are present in second string.
    // This function assumes that the first
    // string will not contain two consecutive '*'
    if (first.length() > 1 && first.charAt(0) == '*' &&
                              second.length() == 0)
        return false;
 
    // If the first string contains '?',
    // or current characters of both strings match
    if ((first.length() > 1 && first.charAt(0) == '?') ||
        (first.length() != 0 && second.length() != 0 &&
         first.charAt(0) == second.charAt(0)))
        return match(first.substring(1),
                     second.substring(1));
 
    // If there is *, then there are two possibilities
    // a) We consider current character of second string
    // b) We ignore current character of second string.
    if (first.length() > 0 && first.charAt(0) == '*')
        return match(first.substring(1), second) ||
               match(first, second.substring(1));
    return false;
}
 

int wildCard(String pattern, String str)
    {
        int n=pattern.length(),m=str.length();
        boolean dp[][]=new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
         if(pattern.charAt(i-1)=='*')
         dp[0][i]=dp[0][i-1];
         else
         break;
       }
        for(int i=1;i<=m;i++){//str
            for(int j=1;j<=n;j++){
                if(pattern.charAt(j-1)==str.charAt(i-1)||pattern.charAt(j-1)=='?')
                dp[i][j]=dp[i-1][j-1];
                else if(pattern.charAt(j-1)=='*')
                dp[i][j]=dp[i-1][j]||dp[i][j-1];
            }
        }
        return dp[m][n]?1:0;
    }
