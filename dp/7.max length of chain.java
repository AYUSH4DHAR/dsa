class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}

class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Arrays.sort(arr,new CompareByFirst());
       int[] t = new int[n];
       for(int i=0;i<n;i++)
              t[i] = 1;
       for ( int i = 1; i < n; i++ )
          for (int  j = 0; j < i; j++ )
            if(arr[i].x > arr[j].y)
             t[i] = Math.max(t[i],t[j]+1);
        
        
        int max = 1;
        for(int i=0;i<n;i++)
        max = t[i] > max ? t[i] : max;
        
    return max;
        
    }
}
