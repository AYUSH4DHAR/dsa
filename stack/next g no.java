public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> s = new Stack<>();              
        long nge[] = new long[n]; 
        
        //traversing the array from last element in backward direction.
        for (int i = n - 1; i >= 0; i--)
        {     
            if (!s.empty()) 
            {              
                //while element at top of stack is less than or equal to
                //current array element, we pop elements from the stack.
                while (!s.empty() && s.peek() < arr[i]) {
                    s.pop();                              
                } 
            } 
            //if stack becomes empty, we store -1 in the answer list 
            //else we store the top element of the stack.   
            nge[i] = s.empty() ? -1 : s.peek();  
            
            //pushing the current array element into the stack.
            s.push(arr[i]);                     
        } 
        //returning the list.
        return nge;
        
    } 
}
