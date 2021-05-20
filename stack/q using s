class StackQueue
{
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	//Function to push an element in queue by using 2 stacks.
	void Push(int B)
	{
	    //inserting the element in first stack.
		s1.push(B);
	}
	
	//Function to pop an element from queue by using 2 stacks.
	int Pop()
	{
		if(s2.isEmpty())
		{
		    //if both stacks are empty, we return -1.
			if(s1.isEmpty())
				return -1;
			
			//we keep removing the top element from first stack and keep
            //pushing them in second stack. Thus, the order gets reversed.
			while(!s1.isEmpty())
			{
				int r = s1.peek();
				s1.pop();
				s2.push(r);
			}
			
			//second stack holds the elements in reversed order so we just store 
            //and then pop the element at top of the stack.
			int k = s2.peek();
			s2.pop();
			
			
			while(!s2.isEmpty())
			{
				int l = s2.peek();
				s2.pop();
				s1.push(l);
			}
			
			return k;
		}
		return -1;
	}
}
