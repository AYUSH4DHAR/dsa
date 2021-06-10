class Solution
{
    //Function to find the maximum profit and the number of jobs done.
	 public Job(char id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    int[] JobScheduling(Job arr[], int n)
    {
        //sorting all jobs according to decreasing order of profit.
       // Arrays.sort(arr, new jobComparator());
          Arrays.sort(arr,Comparator.comparing((Job j)->j.profit).thenComparing(j->j.deadline).reversed());*************************************************
// 		    Collections.sort(arr,
//                          (a, b) -> b.profit - a.profit);*******************************************************

        int res=0, count=0;
        //array to store result (Sequence of jobs).
        int[] result = new int[n];
        //boolean array to keep track of free time slots. 
        boolean[] slot = new boolean[n];
        
        //initializing all slots to free.
        Arrays.fill(slot, false);
        
        //iterating through all given jobs.
        for (int i=0; i<n; i++)
        { 
            //finding a free slot for current job (Note that we start 
        	//from the last possible slot).
            for (int j=Integer.min(n, arr[i].deadline)-1; j>=0; j--) 
            { 
                //if free slot is found, we add current job to result array
        		//and make the current slot occupied.
                if (slot[j]==false)
                { 
			        result[j] = i; 
			        slot[j] = true;
			        break; 
		        } 
	        } 
	    } 
	    for (int i=0; i<n; i++)
	    {
	        //if slot is occupied, we update the counter and 
    	    //add its profit in final result.
	        if(slot[i]) {
	            count++;
	            res += arr[result[i]].profit;
	        }
	    }
	    
	    //storing the count of jobs and max profit in a list and returning it.
	    int[] ans = new int[2];
	    ans[0] = count;
	    ans[1] = res;
	    return ans;
    }
    
}
