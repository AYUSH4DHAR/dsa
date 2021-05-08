  public String findSubString( String str) {
        // Your code goes here
         int n = str.length();
        boolean[] vis = new boolean[256];
        int dc=0; 
        for(int i=0;i<n;i++){
            if(!vis[str.charAt(i)]){
             vis[str.charAt(i)]=true;
             dc++;
            }
        }
        int start=0;
        int si=-1;
        int c=0;
        int l = Integer.MAX_VALUE;
        int[] arr = new int[256];
        for(int j=0;j<n;j++)
        {
            arr[str.charAt(j)]++;
            if(arr[str.charAt(j)]==1)
             c++;
             if(c==dc){
                 while(arr[str.charAt(start)]>1){
                     if(arr[str.charAt(start)]>1)
                       arr[str.charAt(start)]--;
                      start++;
                 }
                 int len= j-start+1;
                 if(len<l){
                 si = start;
                 l=len;
                   //these 3 are optional add if dont understand upper code
                   
//                   arr[str.charAt(start)]--;
//                  start++;
//                  c--;
                 }
             }
        }
        return str.substring(si,si+l);
    }
