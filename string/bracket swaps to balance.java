class Solution{   
public:
    int minimumNumberOfSwaps(string S){
        int swap=0, imbalance=0;
    	int countLeft=0, countRight=0;
    	int sizeOfArray=S.size();
    
    	for(int i=0;i<sizeOfArray;++i){
    
    		if(S[i] == '[')  
            { 
                    // increment count of Left bracket 
                    countLeft++;  
                    if(imbalance > 0)  *********************************************
                    { 
                        // swaps count is last swap count + total  
                        // number imbalanced brackets 
                        swap += imbalance;  
                        // imbalance decremented by 1 as it solved 
                        // only one imbalance of Left and Right 
                        imbalance--;      
                    } 
            } 
            else if(S[i] == ']' )  
            { 
                    // increment count of Right bracket 
                    countRight++;  
                    // imbalance is reset to current difference  
                    // between Left and Right brackets 
                    imbalance = (countRight-countLeft);  
            } 
    	}
    
    	return swap;
        
    }
};
***************************
  Vector<Integer> pos = new Vector<Integer>();
    for(int i = 0; i < s.length(); ++i)
        if (s.charAt(i) == '[')
            pos.add(i);
             
    // To count number of encountered '['
    int count = 0;
     
    // To track position of next '[' in pos
    int p = 0; 
     
    // To store result
    long sum = 0;
     
    char[] S = s.toCharArray();
     
    for(int i = 0; i < s.length(); ++i)
    {
         
        // Increment count and move p
        // to next position
        if (S[i] == '[')
        {
            ++count;
            ++p;
        }
        else if (S[i] == ']')
            --count;
  
        // We have encountered an
        // unbalanced part of string
        if (count < 0)
        {
             
            // Increment sum by number of
            // swaps required i.e. position
            // of next '[' - current position
            sum += pos.get(p) - i;
            char temp = S[i];
            S[i] = S[pos.get(p)];
            S[pos.get(p)] = temp;
            ++p;
  
            // Reset count to 1
            count = 1;
        }
    }
    return sum;
}
