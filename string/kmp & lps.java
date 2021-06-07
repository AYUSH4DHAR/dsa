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
 void KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();
  
        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0; // index for pat[]
  
        // Preprocess the pattern (calculate lps[]
        // array)
        computeLPSArray(pat, M, lps);
  
        int i = 0; // index for txt[]
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                                   + "at index " + (i - j));
                j = lps[j - 1];
            }
  
            // mismatch after j matches
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }
