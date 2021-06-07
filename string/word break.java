     public static int wordBreak(String A, ArrayList<String> B )
    {
 int i=0,j=1,count=0;
        while(j<=A.length()){
            if(B.contains(A.substring(i,j)))
            {
                
                count+=(j-i);
                i=j;
                j++;
               
            }
            else
            {
                j++;
            }
        }
        if(count==A.length())
         return 1;
        else
        return 0;
        
    }
