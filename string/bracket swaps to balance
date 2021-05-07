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
                    if(imbalance > 0)  
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
