public Stack<Integer> sort(Stack<Integer> s)
	{
		int[] a=new int[100000];
		for(int i=0;i<100000;i++){
			a[i]=0;
		}
		while(!s.empty()){
			a[s.peek()]++;
			s.pop();
		}
		for(int i=0;i<100000;i++){
			if(a[i]>0){
				for(int j=0;j<a[i];j++){
					s.push(i);
				}
			}
		}
		return s;
	}
*********************
sortStack(stack S)
    if stack is not empty:
        temp = pop(S);  
        sortStack(S); 
        sortedInsert(S, temp);
Below algorithm is to insert element is sorted order:

sortedInsert(Stack S, element)
    if stack is empty OR element > top element
        push(S, elem)
    else
        temp = pop(S)
        sortedInsert(S, element)
        push(S, temp)
