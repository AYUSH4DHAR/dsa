 public static int minOps(String A, String B)
    {
         
        // This parts checks whether conversion is
        // possible or not
        if(A.length() != B.length())
            return -1;
         
        int i, j, res = 0;
        int count [] = new int [256];
         
        // count characters in A
         
        // subtract count for every character in B
        for(i = 0; i < A.length(); i++)
        {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }
         
        // Check if all counts become 0
        for(i = 0; i < 256; i++)
            if(count[i] != 0)
                return -1;
         
        i = A.length() - 1;
        j = B.length() - 1;
 
        while(i >= 0)
        {
            // If there is a mismatch, then
            // keep incrementing result 'res'
            // until B[j] is not found in A[0..i]
            if(A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;        
        }
        return res;    
    }
 
