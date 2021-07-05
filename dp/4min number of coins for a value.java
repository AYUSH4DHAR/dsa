  public long minimumNumberOfCoins(int coins[],int numberOfCoins,int value)
    {
        // your code here
      long[] t = new long[value+1];
      Arrays.fill(t,value+1);
      t[0] = 0;
      for(int i=1;i<=value;i++){
          for(int j=0;j<coins.length;j++){
              if(coins[j]<=i)
              t[i] = Math.min(t[i],1 + t[i-coins[j]]);
          }
      }
      return t[value] <= value ? t[value] : -1;
    }
}
