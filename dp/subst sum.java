  static boolean equal_sum(int a[],int that_value,int n)
    {
        boolean t[][]=new boolean[n+1][that_value+1];
        
        for(int i=0;i<=n;i++)
        {
            t[i][0]=true;
        }
        
        for(int i=1;i<=that_value;i++)
        {
            t[0][i]=false;
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=that_value;j++)
            {
                if(a[i-1]>j)
                {
                    t[i][j]=t[i-1][j];
                }
                else if(a[i-1]<=j)
                {
                    t[i][j]=(t[i-1][j-a[i-1]] || t[i-1][j]);
                }
            }
        }
        
