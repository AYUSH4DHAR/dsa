int log2(int x) 
{ 
    int res = 0; 
    while (x >>= 1) 
        res++; 
    return res; 
} 
Logic: We right shift x repeatedly until it becomes 0, meanwhile we keep count on the shift operation. This count value is the log2(x).
    
    **********************************************
    
    
    if a number N is a power of 2 then bitwise-AND(&) of N and N-1 will be zero. We can say that N is a power of 2 or not based on the value of N&(N-1).
