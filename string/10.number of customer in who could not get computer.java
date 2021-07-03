static int runCustomerSimulation(int n, char []seq) 
{ 
    // seen[i] = 0, indicates that customer 'i' is not in cafe 
    // seen[1] = 1, indicates that customer 'i' is in cafe but 
    //         computer is not assigned yet. 
    // seen[2] = 2, indicates that customer 'i' is in cafe and 
    //         has occupied a computer. 
    char []seen = new char[MAX_CHAR]; 
  
    // Initialize result which is number of customers who could 
    // not get any computer. 
    int res = 0; 
  
    int occupied = 0; // To keep track of occupied computers 
  
    // Traverse the input sequence 
    for (int i=0; i< seq.length; i++) 
    { 
        // Find index of current character in seen[0...25] 
        int ind = seq[i] - 'A'; 
  
        // If First occurrence of 'seq[i]' 
        if (seen[ind] == 0) 
        { 
            // set the current character as seen 
            seen[ind] = 1; 
  
            // If number of occupied computers is less than 
            // n, then assign a computer to new customer 
            if (occupied < n) 
            { 
                occupied++; 
  
                // Set the current character as occupying a computer 
                seen[ind] = 2; 
            } 
  
            // Else this customer cannot get a computer, 
            // increment result 
            else
                res++; 
        } 
  
        // If this is second occurrence of 'seq[i]' 
        else
        { 
              
        // Decrement occupied only if this customer 
        // was using a computer 
        if (seen[ind] == 2) 
            occupied--; 
        seen[ind] = 0; 
        } 
    } 
    return res; 
} 
