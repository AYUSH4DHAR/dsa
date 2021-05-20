class MinStack {

    /** initialize your data structure here. */
    
    Stack<Integer> s;
    int min_e;
    public MinStack() {
         s = new Stack<Integer>();
         min_e = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= min_e){
            s.push(min_e); // to keep track of the prev min element in the stack when this element (which is the new min) will be popped
            min_e = x;
        }
        s.push(x);
    }
    
    public void pop() {
	// popping the element twice when the element to top is min as we have pushed 2 elements (prev min and also the new min) in the stack for this case 
        if(s.pop()== min_e){
            min_e = s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min_e;
    }
