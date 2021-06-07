Let m be the total number of closing brackets and n be the number of opening brackets. We need ⌈m/2⌉ + ⌈n/2⌉ reversals,



int len = expr.length();
        int ans;
       
        // Expressions of odd lengths
        // cannot be balanced
        if (len % 2 != 0) {
            return -1;
        }
        int left_brace = 0, right_brace = 0;
        for (int i = 0; i < len; i++) {
            char ch = expr.charAt(i);
           
            // If we find a left bracket then we simply
            // increment the left bracket
            if (ch == '{') {
                left_brace++;
            }
           
            // Else if left bracket is 0 then we find
            // unbalanced right bracket and increment
            // right bracket or if the expression
            // is balanced then we decrement left
            else {
                if (left_brace == 0) {
                    right_brace++;
                }
                else {
                    left_brace--;
                }
            }
        }
        ans = (int)(Math.ceil((0.0 + left_brace) / 2)
                    + Math.ceil((0.0 + right_brace) / 2));
        return ans;


*******************************************
less efficient 
******************
   int len = expr.length();
     
        // length of expression must be even to make
        // it balanced by using reversals.
        if (len%2 != 0)
        return -1;
     
        // After this loop, stack contains unbalanced
        // part of expression, i.e., expression of the
        // form "}}..}{{..{"
        Stack<Character> s=new Stack<>();
         
        for (int i=0; i<len; i++)
        {
            char c = expr.charAt(i);
            if (c =='}' && !s.empty())
            {
                if (s.peek()=='{')
                    s.pop();
                else
                    s.push(c);
            }
            else
                s.push(c);
        }
     
        // Length of the reduced expression
        // red_len = (m+n)
        int red_len = s.size();
     
        // count opening brackets at the end of
        // stack
        int n = 0;
        while (!s.empty() && s.peek() == '{')
        {
            s.pop();
            n++;
        }
     
        // return ceil(m/2) + ceil(n/2) which is
        // actually equal to (m+n)/2 + n%2 when
        // m+n is even.
        return (red_len/2 + n%2);
    }
