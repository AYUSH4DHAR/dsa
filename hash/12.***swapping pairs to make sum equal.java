 long getSum(long X[], int n)
	{
	    long sum = 0;
	    for (int i = 0; i < n; i++)
	        sum += X[i];
	    return sum;
	}
	 

	long getTarget(long A[], int n, long B[], int m)
	{

	    long sum1 = getSum(A, n);
	    long sum2 = getSum(B, m);
	 

	    if ((sum1 - sum2) % 2 != 0)
	        return Long.MAX_VALUE;
	    return ((sum1 - sum2) / 2);
	}
	
    int findSwapValues(long A[], int n, long  B[], int m)
    {
        Arrays.sort(A);
        Arrays.sort(B);
	    
	 

	    long target = getTarget(A, n, B, m);
	 
	    if (target == Long.MAX_VALUE)
	        return -1;
	 
	    int i = 0, j = 0;
	    while (i < n && j < m) 
	    {
	        long diff = A[i] - B[j];
	        if (diff == target) 
	        {
	            return 1;
	        }

	        else if (diff < target)
	            i++;

	        else
	            j++;
	    }
	    
	    return -1;
	}
