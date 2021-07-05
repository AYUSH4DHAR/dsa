same as subset sum
sum=sum/2;
dp[n][sum] 



  int sum=0;
          for(int i=0;i<n;i++){
              sum+=a[i];
          }
          if(sum%2!=0)
          return false;
         
          sum = sum/2; 
          boolean t[][]=new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
        {
            t[i][0]=true;
        }
        
        for(int i=1;i<=sum;i++)
        {
            t[0][i]=false;
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(a[i-1]>j)// if subset sum was true for i-1th pRT OF Array then in will be for i also 
                {
                    t[i][j]=t[i-1][j];
                }
                else if(a[i-1]<=j)
                {
                    t[i][j]=(t[i-1][j-a[i-1]] || t[i-1][j]);
                }
            }
    }
    return t[n][sum];
