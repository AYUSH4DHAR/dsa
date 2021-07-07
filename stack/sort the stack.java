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
