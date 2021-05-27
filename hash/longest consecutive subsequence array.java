static int findLongestConseqSubseq(int a[], int n)
	{
	    //using a HashSet to store elements.
		HashSet<Integer> hs = new HashSet<Integer>();
		int ans = 0;
		
		//inserting all the array elements in HashSet.
		for(int i=0; i<n; i++)
			hs.add(a[i]);
		
		//checking each possible sequence from the start. 
		for(int i=0; i<n; i++)
		{
		    //if current element is starting element of a sequence then only 
            //we try to find out the length of sequence. 
			if(!hs.contains(a[i]-1))
			{
				int j = a[i];
				//then we keep checking whether the next consecutive elements
                //are present in HashSet and we keep incrementing the counter. 
				while(hs.contains(j))
				{
					j++;
				}
				
				//storing the maximum count.
				if(ans<j-a[i])
					ans=j-a[i];
			}
		}
		//returning the length of longest subsequence.
		return ans;
	}
