   void lps(String s,int[] lps) {
        // code here
        // int[] arr = new int[s.length()];
       int n = s.length();
        
        
        lps[0] = 0;
        
        int i = 0, j = 1;
        while(j < n)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                lps[j] = i + 1;
                i++;
                j++;
            } 
            else
            {
                if(i == 0)
                {
                    lps[j] = 0;
                    j++;
                } 
                else
                {
                    i = lps[i - 1];
                }
            }
        }
        
       
    }
